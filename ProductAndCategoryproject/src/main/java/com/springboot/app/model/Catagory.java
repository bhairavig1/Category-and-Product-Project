package com.springboot.app.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Catagory 
{
	@Id
	private String cid;
	private String cname;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Product> prod;
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public List<Product> getProd() {
		return prod;
	}
	public void setProd(List<Product> prod) {
		this.prod = prod;
	}
	
	
}
