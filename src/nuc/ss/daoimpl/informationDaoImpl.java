package nuc.ss.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import nuc.ss.Dao.informationDao;
import nuc.ss.entity.Information;
import nuc.ss.util.DBUtil;

public class informationDaoImpl implements informationDao {

	@Override
	public int insertOne(Information information) {
		// TODO Auto-generated method stub
		String sql = "insert into kd values(?,?,?,?,?,?,?,?,?,?,?,?)";
		Object[] objs = {
				information.getKd_no(),
				information.getSj_name(),
				information.getSj_phone(),
				information.getSj_address(),
				information.getFj_name(),
				information.getFj_phone(),
				information.getFj_address(),
				information.getPs_name(),
				information.getPs_phone(),
				information.getPs_condition(),
				information.getGs_no(),
				information.getPs_no()
		};
		int n = DBUtil.excuteDML(sql, objs);
		return n;
	}

	@Override
	public List<Information> selectAll() {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConnection();
		String sql = "select * from kd";
		PreparedStatement ps = DBUtil.getPreparedStatement(conn, sql);
		ResultSet rs = null;
		List<Information> list = new ArrayList<Information>();
		try {
			rs = ps.executeQuery();
			while(rs.next()) {
				Information information = new Information(
						rs.getInt("kd_no"),
						rs.getString("sj_name"), 
						rs.getString("sj_phone"),
						rs.getString("sj_address"), 
						rs.getString("fj_name"),
						rs.getString("fj_phone"),
						rs.getString("fj_address"), 
						rs.getString("ps_name"),
						rs.getString("ps_phone"), 
						rs.getString("ps_condition"),
						rs.getString("gs_no"),
						rs.getString("ps_no")
					);
				
				list.add(information);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeAll(rs, ps, conn);
		}
		return list;
	}

	@Override
	public int deleteOne(int id) {
		// TODO Auto-generated method stub
		String sql = "delete from kd where kd_no=?";
		Object[] objs = {id};
		int n = DBUtil.excuteDML(sql, objs);
		return n;
	}

	@Override
	public Information selectOne(int id) {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConnection();
		String sql = "select * from kd where kd_no=?";
		PreparedStatement ps = DBUtil.getPreparedStatement(conn, sql);
		System.out.println(id);
		try {
			ps.setInt(1, id);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		ResultSet rs = null;
		Information information = null;
		try {
			rs = ps.executeQuery();
			if(rs.next()) {
				information = new Information(
						rs.getInt("kd_no"),
						rs.getString("sj_name"), 
						rs.getString("sj_phone"),
						rs.getString("sj_address"), 
						rs.getString("fj_name"),
						rs.getString("fj_phone"),
						rs.getString("fj_address"), 
						rs.getString("ps_name"),
						rs.getString("ps_phone"), 
						rs.getString("ps_condition"),
						rs.getString("gs_no"),
						rs.getString("ps_no")
					);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeAll(rs, ps, conn);
		}
		
		return information;		
	}

	@Override
	public int updateOne(Information information) {
		// TODO Auto-generated method stub
		String sql = "update kd set sj_name=?,sj_phone=?,sj_address=?,fj_name=?,fj_phone=?,fj_address=?,ps_name=?,ps_phone=?,ps_condition=?,gs_no=?,ps_no=? where kd_no=?";
		System.out.println(information.toString());
		Object[] objs = { information.getSj_name(),information.getSj_phone(),information.getSj_address(),information.getFj_name(),information.getFj_phone()
				,information.getFj_address(),information.getPs_name(),information.getPs_phone(),information.getPs_condition(),information.getGs_no(),information.getPs_no(),
				information.getKd_no()};
		
		int n = DBUtil.excuteDML(sql, objs);
		return n;
	}
	
	int pageSize = 5;//页面大小
	int pageCount;//页数
	int rowCount;//数据库记录数
	int rowNum;//第几行
	static PreparedStatement ps = null;
	static ResultSet rs = null;

	@Override
	public List<Information> getByPage(int pageNow) {
		// TODO Auto-generated method stub
		Connection cn = DBUtil.getConnection();
		List<Information> list = new ArrayList<Information>();

		try {
			rowNum = (pageNow - 1)*5;
			ps = cn.prepareStatement("select * from kd order by kd_no asc limit ?,5;");
			ps.setInt(1, rowNum);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				Information information = new Information(
						rs.getInt("kd_no"),
						rs.getString("sj_name"), 
						rs.getString("sj_phone"),
						rs.getString("sj_address"), 
						rs.getString("fj_name"),
						rs.getString("fj_phone"),
						rs.getString("fj_address"), 
						rs.getString("ps_name"),
						rs.getString("ps_phone"), 
						rs.getString("ps_condition"),
						rs.getString("gs_no"),
						rs.getString("ps_no")
					);
				list.add(information);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeAll(rs, ps, cn);
		}

		return list;
	}
	
	

	@Override
	public int getPageCount() {
		// TODO Auto-generated method stub
		Connection cn = null;
		try {
			cn = DBUtil.getConnection();
			ps = cn.prepareStatement("select count(*) from kd");
			rs = ps.executeQuery();
			rs.next();
			rowCount = rs.getInt(1);
			pageCount = (rowCount -1)/pageSize+1;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.closeAll(rs, ps, cn);
		}
		
		return pageCount;
	}


	
	public Information findOne(String uid, String pwd) {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConnection();
		String sql = "select * from ps where ps_no=? and ps_password=?";
		PreparedStatement ps = DBUtil.getPreparedStatement(conn, sql);
		ResultSet rs = null;
		Information information = null;
		try {
			ps.setString(1, uid);
			ps.setString(2, pwd);
			
			rs = ps.executeQuery();
			if(rs.next()) {
				information = new Information(
						rs.getInt("kd_no"),
						rs.getString("sj_name"), 
						rs.getString("sj_phone"),
						rs.getString("sj_address"), 
						rs.getString("fj_name"),
						rs.getString("fj_phone"),
						rs.getString("fj_address"), 
						rs.getString("ps_name"),
						rs.getString("ps_phone"), 
						rs.getString("ps_condition"),
						rs.getString("gs_no"),
						rs.getString("ps_no")
					);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBUtil.closeAll(rs, ps, conn);
		}
		
		return information;
	}

	public List<Information> selectSome(int id) {
		Connection conn = DBUtil.getConnection();
		System.out.println(id);
		String sql = "select * from kd where ps_no=?";
		PreparedStatement ps = DBUtil.getPreparedStatement(conn, sql);
		ResultSet rs = null;
		List<Information> list = new ArrayList<Information>();
		try {
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while(rs.next()) {
				Information information = new Information(
						rs.getInt("kd_no"),
						rs.getString("sj_name"), 
						rs.getString("sj_phone"),
						rs.getString("sj_address"), 
						rs.getString("fj_name"),
						rs.getString("fj_phone"),
						rs.getString("fj_address"), 
						rs.getString("ps_name"),
						rs.getString("ps_phone"), 
						rs.getString("ps_condition"),
						rs.getString("gs_no"),
						rs.getString("ps_no")
					);
				System.out.println(information.toString());
				list.add(information);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeAll(rs, ps, conn);
		}
		return list;
	}
}
