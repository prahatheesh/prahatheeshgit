package com.shoutoutcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shoutoutDAO.Daointerface;
import com.shoutoutmodel.Customer;

@RestController
public class Shoutcontroller {
	
	private Daointerface udao;
	
	@RequestMapping(value="/register/{username}/{emailaddress}/{password}/{mobilenumber}",method=RequestMethod.POST,headers="Accept=application/json")
	public ResponseEntity<Customer> register(@PathVariable String username,@PathVariable String emailaddress,@PathVariable String password,@PathVariable String mobilenumber){
	System.out.println("welcome");
	Customer custom=new Customer();
	System.out.println("welcome1");
	custom.setUsername(username);
	custom.setEmailaddress(emailaddress);
	custom.setPassword(password);
	custom.setMobilenumber(mobilenumber);
	 udao.save(custom);
	 return new ResponseEntity<Customer>(HttpStatus.OK);
}

}
	
