package com.shoutoutDAO;

import java.util.List;

import com.shoutoutmodel.User;

public interface Daointerface {

	public void insert(User user);
    public void update(User user);
    public void delete(User user); 
    public List<User> list(String username,String password);
}
