package com.shoutoutconfiguration;

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

import com.shoutoutDAO.Daoimplimentation;
import com.shoutoutDAO.Daointerface;
import com.shoutoutmodel.Customer;


@Configuration

@EnableTransactionManagement
public class Applicationconfiguration {
	
	@Autowired
	   @Bean (name="sessionFactory")
	   public SessionFactory getSessionFactory(DataSource dataSource) {
	     LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
	     sessionBuilder.addProperties(getHibrnateProperties());
	     System.out.println("before");
	     sessionBuilder.addAnnotatedClasses(Customer.class);
	 	 return sessionBuilder.buildSessionFactory();
	   }
	
	@Bean(name = "dataSource")
	   public DataSource getDataSource() {
		System.out.println("ata");
	       BasicDataSource dataSource = new BasicDataSource();
	       dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
	       dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
	       dataSource.setUsername("PRAHATHEESH");
	       dataSource.setPassword("123");
	    	       return dataSource;
	   }
	
	
	   private Properties getHibrnateProperties() {
		 
		   Properties properties = new Properties();
		   System.out.println("hellooooo");
		   properties.put("hibernate.show-sql", "true");
		   properties.put("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
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

	@Bean(name="udao")
	   public Daointerface udao()
	   {
		System.out.println("jvvvkv");
		return new Daoimplimentation();
	   }
}