
com.spring.jdbc.dao:

->EmpDao.java file:
package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Employee;

public interface EmpDao {
	
	public int insert(Employee employee);

}