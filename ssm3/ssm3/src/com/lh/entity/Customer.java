package com.lh.entity;

public class Customer {
	
	private Integer cid;
	private String cname;
	private String cphone;
	private Integer cage;
	private Integer did;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(Integer cid, String cname, String cphone, Integer cage, Integer did) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cphone = cphone;
		this.cage = cage;
		this.did = did;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCphone() {
		return cphone;
	}

	public void setCphone(String cphone) {
		this.cphone = cphone;
	}

	public Integer getCage() {
		return cage;
	}

	public void setCage(Integer cage) {
		this.cage = cage;
	}

	public Integer getDid() {
		return did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}


	
}
