package nuc.ss.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import nuc.ss.Dao.courierDao;
import nuc.ss.entity.Courier;

import nuc.ss.util.DBUtil;

public class courierDaoImpl implements courierDao {

	@Override
	public int insertOne(Courier courier) {
		String sql = "insert into ps values(?,?,?,?,?,?,?,?)";
		Object[] objs = {courier.getPs_no(),courier.getPs_name(),courier.getPs_phone(),courier.getPs_area(),courier.getPs_num(),courier.getPs_salary(),courier.getPs_password(),courier.getGs_no()};
		int n = DBUtil.excuteDML(sql, objs);
		return n;
	}

	@Override
	public List<Courier> selectAll() {
		Connection conn = DBUtil.getConnection();
		String sql = "select * from ps";
		PreparedStatement ps = DBUtil.getPreparedStatement(conn, sql);
		ResultSet rs = null;
		List<Courier> list = new ArrayList<Courier>();
		try {
			rs = ps.executeQuery();
			while(rs.next()) {
				Courier courier = new Courier(
						rs.getInt("ps_no"),
						rs.getString("ps_name"), 
						rs.getString("ps_phone"),
						rs.getString("ps_area"),
						rs.getInt("ps_num"),
						rs.getInt("ps_salary"),
						rs.getString("ps_password"),
						rs.getString("gs_no"));
				list.add(courier);
	
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
		String sql = "delete from ps where ps_no=?";
		Object[] objs = {id};
		int n = DBUtil.excuteDML(sql, objs);
		return n;
	}

	@Override
	public Courier selectOne(int id) {
		Connection conn = DBUtil.getConnection();
		String sql = "select * from ps where ps_no=?";
		PreparedStatement ps = DBUtil.getPreparedStatement(conn, sql);
		try {
			ps.setInt(1, id);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		ResultSet rs = null;
		Courier courier = null;
		try {
			rs = ps.executeQuery();
			if(rs.next()) {
				courier = new Courier(
						rs.getInt("ps_no"),
						rs.getString("ps_name"), 
						rs.getString("ps_phone"),
						rs.getString("ps_area"),
						rs.getInt("ps_num"),
						rs.getInt("ps_salary"),
						rs.getString("ps_password"),
						rs.getString("gs_no"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeAll(rs, ps, conn);
		}
		return courier;	
	}

	@Override
	public int updateOne(Courier courier) {
		String sql = "update ps set ps_name=?,ps_phone=?,ps_area=?,ps_num=?,ps_salary=?,ps_password=?,gs_no=? where ps_no=?";
		System.out.println(courier.toString());
		Object[] objs = { courier.getPs_name(),courier.getPs_phone(),
				courier.getPs_area(),courier.getPs_num(),courier.getPs_salary(),
				courier.getPs_password(),courier.getGs_no(), courier.getPs_no()};
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
	public List<Courier> getByPage(int pageNow) {
		Connection cn = DBUtil.getConnection();
		List<Courier> list = new ArrayList<Courier>();

		try {
			rowNum = (pageNow - 1)*5;
			ps = cn.prepareStatement("select * from ps order by ps_no asc limit ?,5;");
			ps.setInt(1, rowNum);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				Courier courier =  new Courier(
						rs.getInt("ps_no"),
						rs.getString("ps_name"), 
						rs.getString("ps_phone"),
						rs.getString("ps_area"),
						rs.getInt("ps_num"),
						rs.getInt("ps_salary"),
						rs.getString("ps_password"),
						rs.getString("gs_no"));
				list.add(courier);
				
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
		Connection cn = null;
		try {
			cn = DBUtil.getConnection();
			ps = cn.prepareStatement("select count(*) from ps");
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

	@Override
	public Courier findOne(String uid, String pwd) {
		Connection conn = DBUtil.getConnection();
		String sql = "select * from ps where ps_no=? and ps_password=?";
		PreparedStatement ps = DBUtil.getPreparedStatement(conn, sql);
		ResultSet rs = null;
		Courier courier = null;
		try {
			ps.setString(1, uid);
			ps.setString(2, pwd);
			
			rs = ps.executeQuery();
			if(rs.next()) {
				courier =  new Courier(
						rs.getInt("ps_no"),
						rs.getString("ps_name"), 
						rs.getString("ps_phone"),
						rs.getString("ps_area"),
						rs.getInt("ps_num"),
						rs.getInt("ps_salary"),
						rs.getString("ps_password"),
						rs.getString("gs_no"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBUtil.closeAll(rs, ps, conn);
		}
		
		return courier;
	}

}
