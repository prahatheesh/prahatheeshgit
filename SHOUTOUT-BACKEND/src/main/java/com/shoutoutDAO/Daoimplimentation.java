package com.shoutoutDAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.shoutoutmodel.User;

public class Daoimplimentation implements Daointerface {
private SessionFactory sessionfactory;
	
	public SessionFactory getSessionfactory() {
	return sessionfactory;
}

public void setSessionfactory(SessionFactory sessionfactory) {
	this.sessionfactory = sessionfactory;
}

@Transactional
	public void insert(User user) {
    Session session=sessionfactory.openSession();
    user.setRoleid("ROLE_USER");
    user.setEnable(true);
    session.save(user);
    session.flush();
	session.close();	
	}

public void update(User user) {
	 Session session=sessionfactory.openSession();
	 session.update(user);
	 session.flush();
     session.close();
	
}

public void delete(User user) {
	 Session session=sessionfactory.openSession();
	 session.delete(user);
	 session.flush();
	 session.close();
}

public List<User> list(String username,String password) {
	// TODO Auto-generated method stub
	Session session=sessionfactory.openSession();
	@SuppressWarnings("unchecked")
	List<User> list= session.createQuery("FROM User user WHERE user.username='"+username+"' and user.password='"+password+"'").list();
	System.out.println(list);
	return list;
}

}
