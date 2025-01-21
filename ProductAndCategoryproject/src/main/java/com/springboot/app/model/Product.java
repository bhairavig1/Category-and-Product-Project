package com.springboot.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product 
{
	@Id
	private String pid;
	private String pname;
	private String pmanufacturedate;
	private String pexpirydate;
	
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPmanufacturedate() {
		return pmanufacturedate;
	}
	public void setPmanufacturedate(String pmanufacturedate) {
		this.pmanufacturedate = pmanufacturedate;
	}
	public String getPexpirydate() {
		return pexpirydate;
	}
	public void setPexpirydate(String pexpirydate) {
		this.pexpirydate = pexpirydate;
	}
	
	
	
}
