package com.spring.jdbc.Dao;

import java.sql.ResultSet;

import com.spring.jdbc.entities.Employee;

public class RawMapperImpl implements RawMapper
{
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Employee e1=new Employee();
		e1.setEid(rs.getInt(1));
		e1.setEname(rs.getString(2));
		return null;
	}
		
}


