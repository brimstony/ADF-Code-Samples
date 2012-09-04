package com.zirous.adf.enrollment.webservice.types;

//JAX-WS Generated Class
public class Contact {
	private String contactName;
	private String contactEmail;
	private String contactPhone;
	private String contactType;
	
	public Contact(){
		super();
	}
	
	public Contact(String contactName, String contactEmail,
			String contactPhone, String contactType) {
		super();
		this.contactName = contactName;
		this.contactEmail = contactEmail;
		this.contactPhone = contactPhone;
		this.contactType = contactType;
	}

	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public String getContactPhone() {
		return contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	public String getContactType() {
		return contactType;
	}
	public void setContactType(String contactType) {
		this.contactType = contactType;
	}
	
}
