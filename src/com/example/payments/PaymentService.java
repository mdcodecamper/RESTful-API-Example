package com.example.payments;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



public class PaymentService {
	PaymentDao paymentDao = new PaymentDao();  
	   @GET 
	   @Path("/payments") 
	   @Produces(MediaType.APPLICATION_XML) 
	   public List<Payment> getPayments(){ 
	      return paymentDao.getAllPayments(); 
	   }  
	   
	   
	   @GET 
	   @Path("/users/userID/payments/numOfDays") 
	   @Produces(MediaType.APPLICATION_XML) 
	   public List<Payment> getPaymentList(int userID, int numOfDays){ 
	      return paymentDao.getAllPaymentsOfSingleUser(userID, numOfDays);
	   }  
}
