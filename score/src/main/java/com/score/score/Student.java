package com.score.score;

public class Student {
	private int sId;
	private String sName;
	private String sAdress;
	public int getsID() {
		return sID;
	}
	public void setsID(int sID) {
		this.sId = sID;
	}
    public String getsName() {
    	returns sName;
    }
    public void setsName (String sName) {
    	this.sName =sName;
    }
    public String getsAddrress() {
    	return sAddress;
    }
    public void setsAddress(String sAddress) {
    	this.setsAddress = sAddress;
    }
    public Student(int sID,String sName,String sAddress) {
    	super();
    	this.sID = sID;
    	this.sName = sName;
    	this.setsAddress = sAddress;
    }
    public Student() {
    	super()
    	// TODO Auto-generated constructor stub
    }
    @override 
    public String toString() {
    	return "Student [sID=" + sID + ", sName=" + sName + ", sAddress=" + sAddress +"}";
    }
}
