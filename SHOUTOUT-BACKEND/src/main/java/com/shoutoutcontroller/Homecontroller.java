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
		 
	@SuppressWarnings("resource")
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    context.scan("com.shoutoutconfiguration");
    System.out.println("config");
    context.refresh();
     udao=(Daointerface)context.getBean("udao");
		 }
		
	
	@RequestMapping(value="/reg/{username}/{emailaddress}/{password}/{mobilenumber}",method=RequestMethod.POST,headers="Accept=application/json")
			public ResponseEntity reg(@PathVariable String username,@PathVariable String emailaddress,@PathVariable String password,@PathVariable String mobilenumber){
		System.out.println("inside register");
		Customer custom=new Customer();
		custom.setUsername(username);
		custom.setEmailaddress(emailaddress);
		custom.setPassword(password);
		custom.setMobilenumber(mobilenumber);
		udao.insert(custom);
		
		return new ResponseEntity(HttpStatus.OK);
	 
	
	}
	
	
	
	
}
