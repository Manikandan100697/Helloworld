package com.lti.bean;

public class PaymentNotification {
	private int studentId;
	private int referenceId;
	private int notificationId;
	private String notifictionMessage;
	
	public PaymentNotification() {
	}
	public PaymentNotification(int studentId, int referenceId, int notificationId, String notifictionMessage) {
		super();
		this.studentId = studentId;
		this.referenceId = referenceId;
		this.notificationId = notificationId;
		this.notifictionMessage = notifictionMessage;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getReferenceId() {
		return referenceId;
	}
	public void setReferenceId(int referenceId) {
		this.referenceId = referenceId;
	}
	public int getNotificationId() {
		return notificationId;
	}
	public void setNotificationId(int notificationId) {
		this.notificationId = notificationId;
	}
	public String getNotifictionMessage() {
		return notifictionMessage;
	}
	public void setNotifictionMessage(String notifictionMessage) {
		this.notifictionMessage = notifictionMessage;
	}
	@Override
	public String toString() {
		return "PaymentNotification [studentId=" + studentId + ", referenceId=" + referenceId + ", notificationId="
				+ notificationId + ", notifictionMessage=" + notifictionMessage + "]";
	}
	
	
}
