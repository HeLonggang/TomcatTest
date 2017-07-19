package com.gzcss.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 鏁版嵁搴撹闂殑鍩烘湰绫�
 * 
 * @author Administrator
 * @version 1.0
 */
public class DBConnection {
	public final static String DB_CLASS = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	public final static String DB_URL = "jdbc:sqlserver://localhost:1433; databaseName=HR";
	public static final String DB_UID = "sa";
	public static final String DB_PWD = "qw123456,.";

	public static Connection getConnection() {
		Connection conn = null;
		try {
			try {
				Class.forName(DB_CLASS);
				conn = DriverManager.getConnection(DB_URL, DB_UID, DB_PWD);
			} catch (ClassNotFoundException e) {
				// TODO: handle exception
				System.out.println("鏃犳硶鎵惧埌椹卞姩绫�");
				e.printStackTrace();
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return conn;
	}

	// 鏌ヨ鏁版嵁淇℃伅
	public int executeSQL(String sql, String[] param) {
		int result = 0;
		Connection conn = getConnection();
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			if (param != null) {
				for (int i = 0; i < param.length; i++) {
					ps.setString(i + 1, param[i]);
				}
			}
			result = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			closeAll(conn, ps, null);
		}

		return result;
	}

	// 鍏抽棴鏁版嵁搴撹繛鎺�
	public static void closeAll(Connection conn, PreparedStatement ps, ResultSet rs) {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		try {
			if (ps != null) {
				ps.close();
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
