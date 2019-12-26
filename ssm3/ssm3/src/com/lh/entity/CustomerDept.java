package com.lh.entity;

public class CustomerDept {
	private Integer cid;
	private String cname;
	private String cphone;
	private Integer cage;
	private String dname;
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
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public CustomerDept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerDept(Integer cid, String cname, String cphone, Integer cage, String dname) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cphone = cphone;
		this.cage = cage;
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "CustomerDept [cid=" + cid + ", cname=" + cname + ", cphone=" + cphone + ", cage=" + cage + ", dname="
				+ dname + "]";
	}
	
	
}
