package com.gzcss.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.gzcss.dao.UserDao;
import com.gzcss.entity.User;
import com.gzcss.util.DBConnection;

public class UserDaoImpl implements UserDao {

	private Connection conn; // 用于保存数据库连接对象
	private PreparedStatement ps;// 用于执行SQL语句
	private ResultSet rs; // 用于保存查询结果集

	@Override
	public List<User> findUser() {
		// TODO Auto-generated method stub
		List<User> list = new ArrayList<User>();
		String sql = "select * from [user]";
		try {
			conn = DBConnection.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			// 读取行数据
			while (rs.next()) {
				User user = new User();
				user.setU_id(rs.getInt("u_id"));
				user.setU_name(rs.getString("u_name"));
				user.setU_sex(rs.getString("u_sex"));
				user.setU_age(rs.getString("u_age"));
				user.setU_tel(rs.getString("u_tel"));
				user.setU_pid(rs.getString("u_pid"));
				user.setU_email(rs.getString("u_email"));
				user.setU_mark(rs.getString("u_mark"));
				list.add(user);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return list;
	}

	@Override
	public int saveUser(String name, String sex, String pid, int age,
			String phone, String mail, String address, String mark) {
		int result = 0;
		String sql = "insert into [User] values(?,?,?,?,?,?,?,?)";
		try {
			conn = DBConnection.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, sex);
			ps.setString(3, pid);
			ps.setInt(4, age);
			ps.setString(5, phone);
			ps.setString(6, mail);
			ps.setString(7, address);
			ps.setString(8, mark);
			result = ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return result;
	}

}
