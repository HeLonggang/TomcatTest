package com.gzcss.entity;

public class User {
	private int u_id;
	private String u_name;
	private String u_sex;
	private String u_pid;
	private String u_age;
	private String u_tel;
	private String u_email;
	private String u_address;
	private String u_mark;

	public int getU_id() {
		return u_id;
	}

	public void setU_id(int u_id) {
		this.u_id = u_id;
	}

	public String getU_name() {
		return u_name;
	}

	public void setU_name(String u_name) {
		this.u_name = u_name;
	}

	public String getU_sex() {
		return u_sex;
	}

	public void setU_sex(String u_sex) {
		this.u_sex = u_sex;
	}

	public String getU_pid() {
		return u_pid;
	}

	public void setU_pid(String u_pid) {
		this.u_pid = u_pid;
	}

	public String getU_age() {
		return u_age;
	}

	public void setU_age(String u_age) {
		this.u_age = u_age;
	}

	public String getU_tel() {
		return u_tel;
	}

	public void setU_tel(String u_tel) {
		this.u_tel = u_tel;
	}

	public String getU_email() {
		return u_email;
	}

	public void setU_email(String u_email) {
		this.u_email = u_email;
	}

	public String getU_address() {
		return u_address;
	}

	public void setU_address(String u_address) {
		this.u_address = u_address;
	}

	public String getU_mark() {
		return u_mark;
	}

	public void setU_mark(String u_mark) {
		this.u_mark = u_mark;
	}

	public User(int u_id, String u_name, String u_sex, String u_pid,
			String u_age, String u_tel, String u_email, String u_address,
			String u_mark) {
		super();
		this.u_id = u_id;
		this.u_name = u_name;
		this.u_sex = u_sex;
		this.u_pid = u_pid;
		this.u_age = u_age;
		this.u_tel = u_tel;
		this.u_email = u_email;
		this.u_address = u_address;
		this.u_mark = u_mark;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

}
