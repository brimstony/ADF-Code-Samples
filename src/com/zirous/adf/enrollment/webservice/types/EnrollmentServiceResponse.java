package com.zirous.adf.enrollment.webservice.types;

import java.util.Date;

//JAX-WS Generated Class
public class EnrollmentServiceResponse {
	private String enrollmentStatus;
	private Integer enrollmentID;
	private Integer transcationID;
	private Date transactionDate;
	
	
	public String getEnrollmentStatus() {
		return enrollmentStatus;
	}
	public void setEnrollmentStatus(String enrollmentStatus) {
		this.enrollmentStatus = enrollmentStatus;
	}
	public Integer getEnrollmentID() {
		return enrollmentID;
	}
	public void setEnrollmentID(Integer enrollmentID) {
		this.enrollmentID = enrollmentID;
	}
	public Integer getTranscationID() {
		return transcationID;
	}
	public void setTranscationID(Integer transcationID) {
		this.transcationID = transcationID;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
}
