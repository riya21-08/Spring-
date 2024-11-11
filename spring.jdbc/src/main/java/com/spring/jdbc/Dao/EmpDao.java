package com.spring.jdbc.Dao;

import com.spring.jdbc.entities.Employee;

public class EmpDao {
	
	public int insert(Employee employee);
	public int update(Employee employee);
	public int delete(Employee employee);
	
	public Employee getEmployee(int,Eid);
	
	public List<Employee> getAllCust();

}
