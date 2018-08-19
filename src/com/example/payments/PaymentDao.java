package com.example.payments;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class PaymentDao {
	
	 public List<Payment> getAllPayments(){ 
	      
	      List<Payment> paymentList = null; 
	      try { 
	         File file = new File("Payments.dat"); 
	         if (!file.exists()) { 
	            Payment payment = new Payment(1, "Test"); 
	            paymentList = new ArrayList<Payment>(); 
	            paymentList.add(payment); 
	            savePaymentList(paymentList); 
	         } 
	         else{ 
	            FileInputStream fis = new FileInputStream(file); 
	            ObjectInputStream ois = new ObjectInputStream(fis); 
	            paymentList = (List<Payment>) ois.readObject(); 
	            ois.close(); 
	         } 
	      } catch (IOException e) { 
	         e.printStackTrace(); 
	      } catch (ClassNotFoundException e) { 
	         e.printStackTrace(); 
	      }   
	      return paymentList; 
	   } 
	 
	 private void savePaymentList(List<Payment> paymentList){ 
	      try { 
	         File file = new File("Payments.dat"); 
	         FileOutputStream fos;  
	         fos = new FileOutputStream(file); 
	         ObjectOutputStream oos = new ObjectOutputStream(fos); 
	         oos.writeObject(paymentList); 
	         oos.close(); 
	      } catch (FileNotFoundException e) { 
	         e.printStackTrace(); 
	      } catch (IOException e) { 
	         e.printStackTrace(); 
	      } 
	   }  
	 
     public List<Payment> getAllPaymentsOfSingleUser(int userID, int numOfDays){ 
		 List<Payment> paymentList = null; 
		 return paymentList; 
	   }  

}
