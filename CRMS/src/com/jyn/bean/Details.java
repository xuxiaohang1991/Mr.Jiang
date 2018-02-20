package com.jyn.bean;

public class Details {
	private Integer did;
	private String dname;
	private String ddesc;
	private String addr;
	private Integer tid;
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDdesc() {
		return ddesc;
	}
	public void setDdesc(String ddesc) {
		this.ddesc = ddesc;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Details(Integer did, String dname, String ddesc, String addr,
			Integer tid) {
		super();
		this.did = did;
		this.dname = dname;
		this.ddesc = ddesc;
		this.addr = addr;
		this.tid = tid;
	}
	public Details(String dname, String ddesc, String addr, Integer tid) {
		super();
		this.dname = dname;
		this.ddesc = ddesc;
		this.addr = addr;
		this.tid = tid;
	}
	
	
}
