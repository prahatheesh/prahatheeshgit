package com.shoutoutDAO;

import java.util.List;

import com.shoutoutmodel.Customer;

public interface Daointerface {

	public void save(Customer user);
   public void update(Customer user);
    //public void delete(User user); 
    //public List<User> list(String username,String password);
}
