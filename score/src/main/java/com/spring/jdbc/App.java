package com.spring.jdbc;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.Dao.EmpDao;
import com.spring.jdbc.entities.Employee;

public class App 
{
    private static ApplicationContext c;
	public static void main( String[] args )
    {
//      System.out.println( "Hello World!" );
    	
    	c = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
    	EmpDao cd = c.getBean("EmpDao",EmpDao.class);
    	
    	Employee c1 = new Employee();
    	c1.setEid(216);
    	c1.setEname("e");
    	c1.setDname("d");
    	int r = cd.insert(c1);
    	
    	System.out.println("Record inserted" +r);
    }
}



