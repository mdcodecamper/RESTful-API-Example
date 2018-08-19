package com.example.payments;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "payment") 

public class Payment implements Serializable{

	private static final long serialVersionUID = 1L;
	private int id; 
	   private String name;   
	   public Payment(){} 
	    
	   public Payment(int id, String name){  
	      this.id = id; 
	      this.name = name; 
	      
	   }  
	   public int getId() { 
	      return id; 
	   }  
	   @XmlElement 
	   public void setId(int id) { 
	      this.id = id; 
	   } 
	   public String getName() { 
	      return name; 
	   } 
	   @XmlElement
	   public void setName(String name) { 
	      this.name = name; 
	   } 
	   
}
