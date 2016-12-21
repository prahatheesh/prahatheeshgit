package com.enfieldfrontend.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;


import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.royaldao.Productdao;
import com.royalmodel.Product;


@Controller
public class Productcontroller {
	
	private Productdao pd;

	 @SuppressWarnings("resource")
	public Productcontroller()
	    {
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	        context.scan("com.royalconfig");
	        context.refresh();
	        pd=((Productdao)context.getBean("pdao"));
	    }
	

	 
	 @RequestMapping("/categories")

	 public ModelAndView printListcust(HttpServletRequest request)
	 {
	 List<Product> list1=pd.prod(request.getParameter("cat"));
		 ModelAndView pro=new ModelAndView("categories");
		 pro.addObject("categ", list1);
		 return pro;
	 }
	 
	 
	 @ModelAttribute("productformobj")
	   public Product getProduct() 
	    {
		    Product pdrt=new Product();
	        return  pdrt ;
	    }

	 
	 @RequestMapping(value="/adminAdd",method=RequestMethod.GET)
	public String gotoPro(Model model){
		Product add1  = new Product();
		model.addAttribute("productformobj",add1);
		return "Productform";
		
	}
	
	@RequestMapping(value = "/adminADDS", method = RequestMethod.POST)
	public String addregister(@ModelAttribute(value="productformobj")Product add1,HttpServletRequest req)throws IOException{
	
	System.out.println("Image uploaded");	
	pd.insert(add1);
	System.out.println(add1.getGt());
	MultipartFile gt1=add1.getGt();
	
	System.out.println(gt1);
	
	String path="C:/Users/admin/git/prahatheeshgit/Enfield/src/main/webapp/resources/image/" +add1.getPid()+".jpg";
	
	byte[] bytes=gt1.getBytes();
	BufferedOutputStream image = new BufferedOutputStream(new FileOutputStream(new File(path)));
	image.write(bytes);
	image.close();
	return "redirect:/listproducts";
	}
	/*{    
	    pd.insert(add1);
	      return "redirect:/listproducts";
	}*/
	
	@RequestMapping("/listproducts")
	public ModelAndView gotolist()
	{
		List<Product> prod=pd.showproducts();
		return new ModelAndView("listpage","lobj",prod);
	}
	
	@RequestMapping("/getProductsByid")
	public ModelAndView getprodid(@RequestParam("pid")int pid)
	{
	Product ob=pd.getproductsbyid(pid);
		
	return new ModelAndView("productpage","showobj",ob);
		
	}
	@RequestMapping("/delete")
	public String deletebyid(@RequestParam("pid")int pid){
		pd.delete(pid);
		return ("redirect:/listproducts");
	}	
	@RequestMapping("/editProduct")
	public ModelAndView edit(@RequestParam("pid")int pid){
	 Product product = this.pd.getproductsbyid(pid);
	 return new ModelAndView("editproductform","editProdObj",product);
	}
	@RequestMapping(value = "/editProductform", method = RequestMethod.POST)
	public String edits(@ModelAttribute(value="editProdObj")Product prod)
	{
		System.out.println(prod.getPname());
		pd.edit(prod);
		return ("redirect:/listproducts");
}
}
	
	
	
	
	
	
	    

