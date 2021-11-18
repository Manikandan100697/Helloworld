package com.lti.bean;

public class Grade {
	private String grade;

	public Grade() {
	}

	public Grade(String grade) {
		super();
		this.grade = grade;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Grade [grade=" + grade + "]";
	}
	
	
}
