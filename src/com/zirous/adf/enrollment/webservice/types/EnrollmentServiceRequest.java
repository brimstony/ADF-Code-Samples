package com.zirous.adf.enrollment.webservice.types;

import java.util.ArrayList;
import java.util.List;

//JAX-WS Generated Class
public class EnrollmentServiceRequest {

	private String companyName;
	private Address companyAddress;
	private List<Contact> contactList = new ArrayList<Contact>();
	
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Address getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(Address companyAddress) {
		this.companyAddress = companyAddress;
	}
	public List<Contact> getContactList() {
		return contactList;
	}
	public void setContactList(List<Contact> contactList) {
		this.contactList = contactList;
	}
}
