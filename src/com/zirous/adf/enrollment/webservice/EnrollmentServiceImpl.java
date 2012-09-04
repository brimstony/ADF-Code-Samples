package com.zirous.adf.enrollment.webservice;

import com.zirous.adf.enrollment.webservice.types.EnrollmentServiceResponse;
import com.zirous.adf.enrollment.webservice.types.EnrollmentServiceRequest;

public class EnrollmentServiceImpl {
	
	public EnrollmentServiceResponse callEnrollmentWebService(EnrollmentServiceRequest enrollmentInfo){
		//insert code to actually call the webservice here (and other JAX-WS boilerplate):
		//return enrollmentService.execute(enrollmentInfo);
		return new EnrollmentServiceResponse();
	}

}
