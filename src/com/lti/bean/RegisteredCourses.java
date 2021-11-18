package com.lti.bean;

public class RegisteredCourses {
	private String courseCode;
	private int semester;
	private int studentId;
	private String grade;
	
	public RegisteredCourses() {
	}
	public RegisteredCourses(String courseCode, int semester, int studentId, String grade) {
		super();
		this.courseCode = courseCode;
		this.semester = semester;
		this.studentId = studentId;
		this.grade = grade;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "RegisteredCourse [courseCode=" + courseCode + ", semester=" + semester + ", studentId=" + studentId
				+ ", grade=" + grade + "]";
	}
	
	
}
