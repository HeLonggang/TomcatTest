package com.gzcss.dao.impl;

import java.sql.*;
import com.gzcss.util.*;
import com.gzcss.dao.AdminDao;
import com.gzcss.entity.Admin;
public class AdminDaoImpl implements AdminDao {

	private Connection conn; // 用于保存数据库连接对象
	private PreparedStatement ps;// 用于执行SQL语句
	private ResultSet rs; // 用于保存查询结果集

	@Override
	public Admin LoginCheck(String Name, String Pass) {

		return null;
	}

	@Override
	public Admin findAdmin(String userName, String password) {
		Admin admin=null;
		String sql = "select ID,Name,Pass from Admin WHERE NAME=? and Pass=?";
		try {
			conn = DBConnection.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, userName);
		    ps.setString(2, password);
			rs = ps.executeQuery();
			if (rs.next()) {
				admin = new Admin();
				admin.setId(rs.getInt("id"));
				admin.setName(userName);
				admin.setPass(password);
			}
			}catch (Exception e) {
				e.printStackTrace();
			} finally {
				DBConnection.closeAll(conn, ps, rs);
			}
		return admin;
	}
}
