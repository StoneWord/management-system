package nuc.ss.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import nuc.ss.Dao.companyDao;
import nuc.ss.entity.Company;
import nuc.ss.util.DBUtil;



public class companyDaoImpl implements companyDao {

	@Override
	public int insertOne(Company company) {
		// TODO Auto-generated method stub
        String sql = "insert into gs values (?,?)";
		
		Object[] objs = {company.getGs_no(),company.getGs_password()};
		int n = DBUtil.excuteDML(sql, objs);
		
		return n;
	}

	@Override
	public Company findOne(String uid, String pwd) {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConnection();
		String sql = "select * from gs where gs_no=? and gs_password=?";
		PreparedStatement ps = DBUtil.getPreparedStatement(conn, sql);
		ResultSet rs = null;
		Company company = null;
		try {
			ps.setString(1, uid);
			ps.setString(2, pwd);
			
			rs = ps.executeQuery();
			if(rs.next()) {
				company = new Company(rs.getString("gs_no"), rs.getString("gs_password"));		
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBUtil.closeAll(rs, ps, conn);
		}
		
		return company;
	}

	@Override
	public boolean findOne(String uid) {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConnection();
		String sql = "select * from gs where gs_no=?";
		PreparedStatement ps = DBUtil.getPreparedStatement(conn, sql);
		ResultSet rs = null;
		try {
			ps.setString(1, uid);
			
			rs = ps.executeQuery();
			if(rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBUtil.closeAll(rs, ps, conn);
		}
		
		return false;
	}
	

}
