package com.shoutoutcontroller;



import java.util.ArrayList;
import java.util.List;
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
	 private Daointerface ud;

	 public Homecontroller()
	{
		 try
		 {
	@SuppressWarnings("resource")
	AnnotationConfigApplicationContext context = new 

AnnotationConfigApplicationContext();
    context.scan("com.shoutoutconfiguration");
    System.out.println("config");
    context.refresh();
     ud=(Daointerface)context.getBean("udao");
	}
		 catch(Exception e){
			 e.printStackTrace();}
		 
	}
	
	@RequestMapping(value="/register}",method=RequestMethod.POST,headers="Accept=application/json")

		public ResponseEntity<Customer> register(@PathVariable String 

username,@PathVariable String emailaddress,@PathVariable String password,@PathVariable String 

mobilenumber){
		System.out.println("welcome");
		Customer Chat=new Customer();
		System.out.println("welcome1");
		Chat.setUsername(username);
		Chat.setEmailaddress(emailaddress);
		Chat.setPassword(password);
		Chat.setMobilenumber(mobilenumber);
		 ud.save(Chat);
		 return new ResponseEntity<Customer>(HttpStatus.OK);
	}
	
	
	@RequestMapping(value="/login/{username}/{password}",method=RequestMethod.POST,headers="Accept=application/json")

		public ResponseEntity<Customer> login(@PathVariable String 

username,@PathVariable String password){
		System.out.println("controller");
		List<Customer> Chat=new ArrayList<Customer>();
		Chat = ud.list(username, password);
		if(Chat.isEmpty())
		{
		System.out.println("invalid details");
		return new ResponseEntity<Customer>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		else
		{
		System.out.println("valid details");
	    return new ResponseEntity<Customer>(HttpStatus.OK);
	
		}
	
	
	}}
	

	
