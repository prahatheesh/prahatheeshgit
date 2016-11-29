package com.royaldao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.royalmodel.User;

@Repository("userdao")
public class UserDAOImpl implements Userdao {
@Autowired


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

