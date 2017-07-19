package com.gzcss.dao;

import java.util.List;

import com.gzcss.entity.Admin;

public interface AdminDao {
//	public Admin Check(String Name);
//	public void addUser(Admin admin); // 添加用户
//	public void deleteUser(Admin admin); // 删除用户
//	public void updateUser(Admin admin); // 修改用户
//	public Admin getUserId(int Id); // 获取用户ID
//	public List<Admin> getTree(Admin admin); // 获取所有树形菜单上的子父节点
//	public Admin login(Admin admin);
//	public List<Admin> getAllRole(); // 查询所有角色
//	public List<Admin> getPageUser(int pageNo, int pageSize);
//  public List<Admin> getUser(); // 查询所有用户
	
	public Admin LoginCheck(String Name, String Pass); // 判断用户是否存在
	/**
	 * 根据用户名和密码，查找相关用户信息
	 * 
	 * @param userName
	 * @param password
	 * @return 用户对象
	 */
	public Admin findAdmin(String userName, String password);

	

}
