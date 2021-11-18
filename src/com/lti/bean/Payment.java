package com.lti.bean;

public class Payment {
	private int studentId;
	private String referenceId;
	private int amount;
	private boolean status;
	
	public Payment() {
	}
	public Payment(int studentId, String referenceId, int amount, boolean status) {
		super();
		this.studentId = studentId;
		this.referenceId = referenceId;
		this.amount = amount;
		this.status = status;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getReferenceId() {
		return referenceId;
	}
	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Payment [studentId=" + studentId + ", referenceId=" + referenceId + ", amount=" + amount + ", status="
				+ status + "]";
	}
	
	
}
