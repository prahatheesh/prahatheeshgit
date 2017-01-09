package com.shoutoutcontroller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shoutoutDAO.Daointerface;
import com.shoutoutmodel.Customer;

@RestController
public class Homecontroller {
	
	 private Daointerface udao;

	 public Homecontroller()
	{
		 try
		 {
	@SuppressWarnings("resource")
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    context.scan("com.shoutoutconfiguration");
    System.out.println("config");
    context.refresh();
     udao=(Daointerface)context.getBean("udao");
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	}
	@RequestMapping(value="/register/{username}",method=RequestMethod.POST,headers="Accept=application/json")
			public ResponseEntity<Customer> register(@PathVariable String username){
		System.out.println("insie register");
		Customer custom=new Customer();
		custom.setUsername(username);
		udao.insert(custom);
		
		return new ResponseEntity<Customer>(HttpStatus.OK);
	 
	
	}
	
	
	
	
}
