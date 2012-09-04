package com.zirous.adf.enrollment;

public interface EnrollmentModelObject {
	
	public abstract void enroll();

	public abstract String getCompanyName();

	public abstract void setCompanyName(String companyName);

	public abstract String getCompanyAddressLine1();

	public abstract void setCompanyAddressLine1(String companyAddressLine1);

	public abstract String getCompanyAddressLine2();

	public abstract void setCompanyAddressLine2(String companyAddressLine2);

	public abstract String getCompanyCity();

	public abstract void setCompanyCity(String companyCity);

	public abstract String getState();

	public abstract void setState(String state);

	public abstract String getZipCode();

	public abstract void setZipCode(String zipCode);

	public abstract String getPrimaryContactName();

	public abstract void setPrimaryContactName(String primaryContactName);

	public abstract String getPrimaryContactEmail();

	public abstract void setPrimaryContactEmail(String primaryContactEmail);

	public abstract String getPrimaryContactPhone();

	public abstract void setPrimaryContactPhone(String primaryContactPhone);

	public abstract String getBillingContactName();

	public abstract void setBillingContactName(String billingContactName);

	public abstract String getBillingContactEmail();

	public abstract void setBillingContactEmail(String billingContactEmail);

	public abstract String getBillingContactPhone();

	public abstract void setBillingContactPhone(String billingContactPhone);

	public abstract String getTechnicalContactName();

	public abstract void setTechnicalContactName(String technicalContactName);

	public abstract String getTechnicalContactEmail();

	public abstract void setTechnicalContactEmail(String technicalContactEmail);

	public abstract String getTechnicalContactPhone();

	public abstract void setTechnicalContactPhone(String technicalContactPhone);

}