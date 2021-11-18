package com.lti.bean;

public class User {
	private int userId;
	private String name;
	private String role;
	
	public User() {
	}
	public User(int userId, String name, String role) {
		super();
		this.userId = userId;
		this.name = name;
		this.role = role;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", role=" + role + "]";
	}
	
	
}
