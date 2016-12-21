package com.enfieldfrontend.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.royaldao.Userdao;
import com.royalmodel.Product;
import com.royalmodel.User;
@Controller
public class Homecontroller  {
 HttpSession session;
	    private Userdao ud;
	
	
	    public Homecontroller()
	    {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.royalconfig");
        context.refresh();
        ud =(Userdao)context.getBean("udao");
        
	    }
	
	    @RequestMapping("/")
        public ModelAndView hello() {	      
        return new ModelAndView("royalenfield");
        }

		@RequestMapping("/home")
	    public ModelAndView helloworld() {	      
	      return new ModelAndView("royalenfield");
	    }

		@RequestMapping("/login")
		public ModelAndView login()  {
		  return new ModelAndView("NewFile");
		}	
		@RequestMapping("/Signin")
	    public ModelAndView register(HttpServletRequest req)throws ServletException,IOException
		{
			 session=req.getSession(true);
			String s= req.getParameter("username");
			String p=req.getParameter("password");
			List<User>ls=ud.list(s,p);
			System.out.println(ls);
			System.out.println(s);
			System.out.println(p);
			System.out.println(ls);
			ModelAndView m=new ModelAndView();
			if(!ls.isEmpty())
			{
			for(int i=0;i<ls.size();i++)
			{		    
			if(ls.get(i).getRoleid().equals("ROLE_ADMIN"))
			{
				System.out.println(ls.get(i).getUsername());
			session.setAttribute("name",ls.get(i).getUsername());
		    m.setViewName("admin");
			}
			else{
		    session.setAttribute("name",ls.get(i).getUsername());
		    m.setViewName("royalenfield");
			}
		    }
	        }
			else
			{
			m.setViewName("NewFile");
			}
			return m;
		    }
		
		@RequestMapping("/registering")
		public ModelAndView Register()  {
		  return new ModelAndView("registering");
		}
		
		@RequestMapping("/aboutus")
		public ModelAndView aboutus()  {
		  return new ModelAndView("aboutus");
		}
		   
		@RequestMapping(value="/adduser",method = RequestMethod.GET)
		public String getuserform(Model model){
			User user = new User();
			model.addAttribute("john",user);
			return "registering";
		}
		
		
		@RequestMapping(value = "/registered", method = RequestMethod.POST)
		   public String addregister(@ModelAttribute(value="john")User user,ModelMap model) 
     	{    
		      ud.insert(user);
		      return "NewFile";
		}
		@RequestMapping("/logout")
		public String logout()
		{
			session.invalidate();
			return "royalenfield";
		}
		}