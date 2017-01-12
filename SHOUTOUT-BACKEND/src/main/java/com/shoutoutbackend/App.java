package com.shoutoutbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shoutoutDAO.Daointerface;
import com.shoutoutmodel.Customer;



public class App {
	public static void main(String[] args)
    {
        @SuppressWarnings("resource")
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.shoutoutconfiguration");
        context.refresh();
        Daointerface udao=(Daointerface)context.getBean("udao");
        System.out.println("check");
        Customer ch = new Customer();
        ch.setEmailaddress("hvhg@fht.hj");
        ch.setEnable(true);
        ch.setMobilenumber("123456");
        ch.setPassword("yyy");
        ch.setRoleid("User");
        ch.setUsername("praggy");
        udao.save(ch);
      	
    	//udao.update(add);
    	System.out.println("last");
       // ud.delete(add);
}
}
