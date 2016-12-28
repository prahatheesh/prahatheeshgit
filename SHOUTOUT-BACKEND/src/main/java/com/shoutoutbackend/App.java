package com.shoutoutbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shoutoutDAO.Daointerface;
import com.shoutoutmodel.User;



public class App {
	public static void main(String[] args)
    {
        @SuppressWarnings("resource")
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.royalconfig");
        context.refresh();
        Daointerface ud=(Daointerface)context.getBean("udao");
       
        User add = new User();
        add.setUsername("");
        add.setEmailaddress("");
        add.setPassword("");
        add.setConfirmpassword("");
        
  
          
      	ud.insert(add);
    	ud.update(add);
        ud.delete(add);
}
}
