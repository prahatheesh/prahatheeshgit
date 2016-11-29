package com.royaldao;

import java.util.List;

import com.royalmodel.Product;

public interface Productdao {

	List<Product> showproducts(); 
	public void edit(Product prod);
    public void insert(Product add1);
	public void delete(int pid);
	public Product getproductsbyid(int pid);
	public List<Product> prod(String category);
}

