package com.lilith.entity;

public class Emp {
	private String name;
	private String userId;
	private String password;

	public Emp() {}
	
	public Emp(String name, String userId, String password) {
		this.name = name;
		this.userId = userId;
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
