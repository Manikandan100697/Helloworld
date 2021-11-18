package com.lti.bean;

public class Student {
	private int studentId;
	private String branch;
	private int batch;
	
	
	public Student() {
	}

	public Student(int studentId, String branch, int batch) {
		super();
		this.studentId = studentId;
		this.branch = branch;
		this.batch = batch;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getBatch() {
		return batch;
	}

	public void setBatch(int batch) {
		this.batch = batch;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", branch=" + branch + ", batch=" + batch + "]";
	}
	
	
	
}
