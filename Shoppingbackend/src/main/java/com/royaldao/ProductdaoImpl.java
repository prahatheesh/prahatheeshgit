package com.royaldao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.royalmodel.Product;

@Repository("Productdao")
public class ProductdaoImpl implements Productdao {
@Autowired


private SessionFactory sessionfactory;
	
	public SessionFactory getSessionfactory() {
	return sessionfactory;
}

public void setSessionfactory(SessionFactory sessionfactory) {
	this.sessionfactory = sessionfactory;
}

@Transactional
	public void insert(Product prod) 
{
    Session session=sessionfactory.openSession();
    session.save(prod);
   /* session.flush();
	session.close();*/	
	}


@Transactional

public List<Product> showproducts() {
	Session session=sessionfactory.openSession();
	@SuppressWarnings("unchecked")
	List<Product>product=session.createQuery("from Product").list();	
	return product;
}
@Transactional

public void delete(int pid) {
	// TODO Auto-generated method stub
	Session session=sessionfactory.openSession();
	Product product = (Product)session.get(Product.class, pid);
	session.delete(product);
	/*session.flush();*/
}
@Transactional

public Product getproductsbyid(int pid) {
	// TODO Auto-generated method stub
	Session session=sessionfactory.openSession();
	Product product=(Product)session.get(Product.class, pid);
	/*session.close();*/
	return product;

}
@Transactional
public void edit(Product prod) {
	Session session=sessionfactory.openSession();
    session.update(prod);
    session.flush();
    //session.close();*/
	
}
public List<Product> prod(String category) 
{
	
	// TODO Auto-generated method stub/
	Session session = this.sessionfactory.openSession();
	Criteria criteria = session.createCriteria(Product.class);
	criteria.add(Restrictions.eq("PRODUCTCATEGORY",category));
	
	List<Product> list1 = criteria.list();
	System.out.println(list1);
	System.out.println(list1);
	return list1;

}
}
