package com.spring.jdbc.entities;

public class Employee {
	
	private int eid;
	private String ename;
	private String dname;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String ename, String dname) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", dname=" + dname + "]";
	}
	
	

}
