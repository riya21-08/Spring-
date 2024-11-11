package com.score.stereotype;

import org.score .beans.factory.annotation.Value;
import org.score.context.annotation.Scope;
import org.score .stereotype.Component;

@Component
@Scope("prototype")
public class Student {
	
	@Value("Riya Devre")
	private String sname;
	
	@Value("Makarpura")
	private String address;

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String sname, String address) {
		super();
		this.sname = sname;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [sname=" + sname + ", address=" + address + "]";
	}
	

}
