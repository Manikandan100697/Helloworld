package com.lti.bean;

public class SemesterRegistration {
	private int studentId;
	private int semester;
	private String dateOfRegistration;
	
	public SemesterRegistration() {
	}
	public SemesterRegistration(int studentId, int semester, String dateOfRegistration) {
		super();
		this.studentId = studentId;
		this.semester = semester;
		this.dateOfRegistration = dateOfRegistration;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public String getDateOfRegistration() {
		return dateOfRegistration;
	}
	public void setDateOfRegistration(String dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}
	@Override
	public String toString() {
		return "SemesterRegistration [studentId=" + studentId + ", semester=" + semester + ", dateOfRegistration="
				+ dateOfRegistration + "]";
	}
	
	
}
