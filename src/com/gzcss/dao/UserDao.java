package com.gzcss.dao;

import java.util.List;

import com.gzcss.entity.*;

public interface UserDao {

	/**
	 * 根据用户名和密码，查找相关用户信息
	 * 
	 * @param userName
	 * @param password
	 * @return 用户对象
	 */
	public List<User> findUser();

	public int saveUser(String u_name, String u_sex, String u_pid, int u_age,
			String u_phone, String u_mail, String u_address, String u_mark);
}
