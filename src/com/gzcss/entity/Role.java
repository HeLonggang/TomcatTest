package com.gzcss.entity;

public class Role {
	private int r_id; // 角色ID
	private String r_name;// 角色名称

	public int getR_id() {
		return r_id;
	}

	public void setR_id(int r_id) {
		this.r_id = r_id;
	}

	public String getR_name() {
		return r_name;
	}

	public void setR_name(String r_name) {
		this.r_name = r_name;
	}

	public Role(int r_id, String r_name) {
		super();
		this.r_id = r_id;
		this.r_name = r_name;
	}

	public Role() {
		super();
	}

}
