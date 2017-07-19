package com.gzcss.entity;

public class Admin {
	private int id;// 用户编号
	private String name;// 用户名
	private String pass;// 密码

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	//带参的构造函数
	public Admin(String name, String pass) {
		super();
		this.name = name;
		this.pass = pass;
	}

	//不带参的构造函数
	public Admin() {
		super();
	}

}
