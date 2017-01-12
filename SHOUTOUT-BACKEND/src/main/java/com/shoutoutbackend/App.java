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
        Customer add = new Customer();
        add.setUsername("gggc");
        add.setEmailaddress("vvhvhv");
        add.setPassword("jyff");
        add.setMobilenumber("hjfhjf");
          add.setRoleid("user");
         udao.insert(add);
      	
    	//ud.update(add);
       // ud.delete(add);
}
}
