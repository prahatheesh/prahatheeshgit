package com.shopping.controller.Shoppingbackend;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.royaldao.Productdao;
import com.royaldao.Userdao;
import com.royalmodel.Product;
import com.royalmodel.User;
import com.royalservice.*;



public class App 
{
	
	public static void main(String[] args)
    {
        @SuppressWarnings("resource")
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.royalconfig");
        context.refresh();
       // UserService service = (UserService)context.getBean("serv");
       // Userdao ud=(Userdao)context.getBean("udao");
        Productdao pd=(Productdao)context.getBean("pdao");
       
       /* User add = new User();
        add.setUsername("");
        add.setEmailaddress("");
        add.setPassword("");
        add.setConfirmpassword("");
        
  
          
      	ud.insert(add);
    	ud.update(add);
        ud.delete(add);*/
        Product add2= new Product();
       
        add2.setPname("kjjs");
        add2.setProductprice(7);
        add2.setProductmanufacturer("sshf");
        add2.setProductstrength("htrt");
        add2.setCategory("category");
            
   
        pd.insert(add2);
        pd.delete(1);
        pd.edit(add2);
          
}
}

        
        
