package com.royaldao;

import java.util.List;

import com.royalmodel.User;

public interface Userdao {
   
    public void insert(User user);
    public void update(User user);
    public void delete(User user); 
    public List<User> list(String username,String password);


}