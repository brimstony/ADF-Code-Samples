package com.zirous.adf.enrollment;

import com.zirous.adf.enrollment.webservice.EnrollmentServiceImpl;
import com.zirous.adf.enrollment.webservice.types.Address;
import com.zirous.adf.enrollment.webservice.types.Contact;
import com.zirous.adf.enrollment.webservice.types.EnrollmentServiceRequest;
import com.zirous.adf.enrollment.webservice.types.EnrollmentServiceResponse;

public class EnrollmentAdapter implements EnrollmentModelObject {
	
	// Beginning of screen input fields
	private String companyName;
	private String companyAddressLine1;
	private String companyAddressLine2;
	private String companyCity;
	private String state;
	private String zipCode;
	
	private String primaryContactName;
	private String primaryContactEmail;
	private String primaryContactPhone;
	
	private String billingContactName;
	private String billingContactEmail;
	private String billingContactPhone;
	
	private String technicalContactName;
	private String technicalContactEmail;
	private String technicalContactPhone;
	
	//Displayed results of web service call
	private String enrollmentStatus;
	private Integer enrollmentID;
	
	private EnrollmentServiceImpl enrollmentService = new EnrollmentServiceImpl();
	
	
	@Override
	public void enroll(){
		EnrollmentServiceRequest enrollmentServiceRequest = new EnrollmentServiceRequest();
		
		//populate JAX-WS class with Adapter fields
		enrollmentServiceRequest.setCompanyName(companyName);
		enrollmentServiceRequest.setCompanyAddress(new Address(companyAddressLine1,companyAddressLine2,companyCity, state, zipCode));
		enrollmentServiceRequest.getContactList().add(new Contact(primaryContactName, primaryContactEmail, primaryContactPhone, "PRIMARY"));
		enrollmentServiceRequest.getContactList().add(new Contact(billingContactName, billingContactEmail, billingContactPhone, "BILLING"));
		enrollmentServiceRequest.getContactList().add(new Contact(technicalContactName, technicalContactEmail, technicalContactPhone, "TECH"));
		
		EnrollmentServiceResponse response = enrollmentService.callEnrollmentWebService(enrollmentServiceRequest);
		
		enrollmentStatus = response.getEnrollmentStatus();
		enrollmentID = response.getEnrollmentID();
	}
	
	
	@Override
	public String getCompanyName() {
		return companyName;
	}
	@Override
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	@Override
	public String getCompanyAddressLine1() {
		return companyAddressLine1;
	}
	@Override
	public void setCompanyAddressLine1(String companyAddressLine1) {
		this.companyAddressLine1 = companyAddressLine1;
	}
	@Override
	public String getCompanyAddressLine2() {
		return companyAddressLine2;
	}
	@Override
	public void setCompanyAddressLine2(String companyAddressLine2) {
		this.companyAddressLine2 = companyAddressLine2;
	}
	@Override
	public String getCompanyCity() {
		return companyCity;
	}
	@Override
	public void setCompanyCity(String companyCity) {
		this.companyCity = companyCity;
	}
	@Override
	public String getState() {
		return state;
	}
	@Override
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String getZipCode() {
		return zipCode;
	}
	@Override
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String getPrimaryContactName() {
		return primaryContactName;
	}
	@Override
	public void setPrimaryContactName(String primaryContactName) {
		this.primaryContactName = primaryContactName;
	}
	@Override
	public String getPrimaryContactEmail() {
		return primaryContactEmail;
	}
	@Override
	public void setPrimaryContactEmail(String primaryContactEmail) {
		this.primaryContactEmail = primaryContactEmail;
	}
	@Override
	public String getPrimaryContactPhone() {
		return primaryContactPhone;
	}
	@Override
	public void setPrimaryContactPhone(String primaryContactPhone) {
		this.primaryContactPhone = primaryContactPhone;
	}
	@Override
	public String getBillingContactName() {
		return billingContactName;
	}
	@Override
	public void setBillingContactName(String billingContactName) {
		this.billingContactName = billingContactName;
	}
	@Override
	public String getBillingContactEmail() {
		return billingContactEmail;
	}
	@Override
	public void setBillingContactEmail(String billingContactEmail) {
		this.billingContactEmail = billingContactEmail;
	}
	@Override
	public String getBillingContactPhone() {
		return billingContactPhone;
	}
	@Override
	public void setBillingContactPhone(String billingContactPhone) {
		this.billingContactPhone = billingContactPhone;
	}
	@Override
	public String getTechnicalContactName() {
		return technicalContactName;
	}
	@Override
	public void setTechnicalContactName(String technicalContactName) {
		this.technicalContactName = technicalContactName;
	}
	@Override
	public String getTechnicalContactEmail() {
		return technicalContactEmail;
	}
	@Override
	public void setTechnicalContactEmail(String technicalContactEmail) {
		this.technicalContactEmail = technicalContactEmail;
	}
	@Override
	public String getTechnicalContactPhone() {
		return technicalContactPhone;
	}
	@Override
	public void setTechnicalContactPhone(String technicalContactPhone) {
		this.technicalContactPhone = technicalContactPhone;
	}


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
	

}
