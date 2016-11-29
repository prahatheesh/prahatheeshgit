package com.royalconfig;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.orm.hibernate4.HibernateTransactionManager;

import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.royaldao.Productdao;
import com.royaldao.ProductdaoImpl;
import com.royaldao.UserDAOImpl;
import com.royaldao.Userdao;
import com.royalmodel.Product;
import com.royalmodel.User;

@Configuration
@ComponentScan("com.royalmodel")
@EnableTransactionManagement

public class ApplicationContextConfig {
	
	@Bean(name = "dataSource")
	   public DataSource getDataSource() {
	       BasicDataSource dataSource = new BasicDataSource();
	       dataSource.setDriverClassName("org.h2.Driver");
	       dataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
	       dataSource.setUsername("sa");
	       dataSource.setPassword("sa");
	    	       return dataSource;
	   }
	@Autowired
	   @Bean (name="sessionFactory")
	   public SessionFactory getSessionFactory(DataSource dataSource) {
	      LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
	     sessionBuilder.addProperties(getHibrnateProperties());
	     System.out.println("before");
	     sessionBuilder.addAnnotatedClasses(User.class);
	     System.out.println("after");
	     sessionBuilder.addAnnotatedClasses(Product.class);
	 	 	      return sessionBuilder.buildSessionFactory();
	   }
	 
	   
	   
	   private Properties getHibrnateProperties() {
		 
		   Properties properties = new Properties();
		   System.out.println("hellooooo");
		   properties.put("hibernate.show-sql", "true");
		   properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		   properties.put("hibernate.hbm2ddl.auto", "update");
		   
		   
		return properties;
	}
	@Autowired
	   @Bean(name = "transactionManager")
	
	   public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
	       HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
	       System.out.println("welcome");
	       return transactionManager;
	   }
	

	@Autowired
	@Bean(name="udao")
	   public Userdao getUserService()
	   {
		return new UserDAOImpl();
	   }
	
	@Autowired
	@Bean(name="pdao")
	public Productdao getProductService()
	{
		return new ProductdaoImpl();
	}

	} 





