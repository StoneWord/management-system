package nuc.ss.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/wuliu1?useUnicode=true&characterEncoding=utf-8";
			String username = "root";
			String password = "admin";
			connection = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("鍔犺浇澶辫触锛侀┍鍔ㄧ被娌℃湁鎵惧埌锛�");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("鏁版嵁搴撹繛鎺ュけ璐ワ紒璇锋鏌ユ暟鎹簱鍚嶄互鍙婄敤鎴峰笎鍙凤紒");
		}
		return connection;
	}

	// 鍏抽棴璧勬簮杩炴帴connection,statement,resultset
	public static void closeAll(ResultSet resultSet, Statement statement, Connection connection) {
		if(resultSet != null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if(statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}
	
	// 鍒涘缓鏁版嵁搴撴搷浣滃璞reparedStatement
	public static PreparedStatement getPreparedStatement(Connection connection, String sql) {
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return preparedStatement;
	}
	
	// 鍒涘缓鏁版嵁搴撴搷浣滃璞tatement
	public static Statement getStatement(Connection connection) {
		Statement statement = null;
		try {
			statement = connection.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return statement;
	}
	
	// 灏佽DML璇彞
	public static int excuteDML(String sql, Object...objs) {
		int n = 0;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = getConnection();
			preparedStatement = getPreparedStatement(connection, sql);
			for (int i = 0; i < objs.length; i++) {
				preparedStatement.setObject(i+1, objs[i]);
			}
			n = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			closeAll(null, preparedStatement, connection);
		}
		return n;
	}
	
}
