package com.spring.jdbc.Dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entities.Employee;

public class EmpDaoImpl implements EmpDao{
	
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Employee employee) {
		// TODO Auto-generated method stub
		
		String q = "insert into emp_data(eid,ename,dname) values(?,?,?)";
		int r = this.jdbcTemplate.update(q,employee.getEid(), employee.getEname(), employee.getDname());
		return r;

	}

}