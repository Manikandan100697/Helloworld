package com.lti.bean;

import java.util.List;

public class GradeCard {
	private int studentId;
	private int semester;
	private int cpi;
	private List<RegisteredCourses> registeredCourses;
	
	public GradeCard() {
	}
	public GradeCard(int studentId, int semester, int cpi, List<RegisteredCourses> registeredCourses) {
		super();
		this.studentId = studentId;
		this.semester = semester;
		this.cpi = cpi;
		this.registeredCourses = registeredCourses;
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
	public int getCpi() {
		return cpi;
	}
	public void setCpi(int cpi) {
		this.cpi = cpi;
	}
	public List<RegisteredCourses> getRegisteredCourses() {
		return registeredCourses;
	}
	public void setRegisteredCourses(List<RegisteredCourses> registeredCourses) {
		this.registeredCourses = registeredCourses;
	}
	@Override
	public String toString() {
		return "GradeCard [studentId=" + studentId + ", semester=" + semester + ", cpi=" + cpi + ", registeredCourses="
				+ registeredCourses + "]";
	}
	
	
	
}
