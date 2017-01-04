package com.shoutoutcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shoutoutDAO.Daoimplimentation;
import com.shoutoutmodel.Customer;

@RestController
public class Homecontroller {
@Autowired
private Daoimplimentation Customerbean;
	
	@RequestMapping(value="/register/{name}",method=RequestMethod.POST)
			public ResponseEntity<Customer> register(@PathVariable String name){
		
		Customer custom=new Customer();
		Customerbean.insert(custom);
		
		return new ResponseEntity<Customer>(custom,HttpStatus.OK);
	 
	
	}
	
	
	
	
}
