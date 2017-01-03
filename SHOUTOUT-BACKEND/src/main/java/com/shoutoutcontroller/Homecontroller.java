package com.shoutoutcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {

	
	@RequestMapping(value="/register/{name}",method=RequestMethod
			public ResponseEntity register(@PathVariable String name){
	 
		try{
			Student s=new Student();
			s.setName(name);
			rd.register(s);
			return new ResponseEntity(HttpStatus.OK);
			
		}
	}
	
	
	
	
}
