package com.lti.bean;

public class Professor {
	private String department;
	private String designation;
	private String DOJ;
	
	public Professor() {
	}
	public Professor(String department, String designation, String dOJ) {
		super();
		this.department = department;
		this.designation = designation;
		DOJ = dOJ;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDOJ() {
		return DOJ;
	}
	public void setDOJ(String dOJ) {
		DOJ = dOJ;
	}
	@Override
	public String toString() {
		return "Professor [department=" + department + ", designation=" + designation + ", DOJ=" + DOJ + "]";
	}
	
	
}
