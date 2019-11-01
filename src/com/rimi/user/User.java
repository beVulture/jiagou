package com.rimi.user;

public class User {
//	用户姓名
	private String name;
//	密码
	private String password;

	public String getName() {
		return name;
	}

	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
