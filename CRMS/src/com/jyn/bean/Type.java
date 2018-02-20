package com.jyn.bean;

public class Type {
	private Integer tid;
	private String tname;
	private String tdesc;
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTdesc() {
		return tdesc;
	}
	public void setTdesc(String tdesc) {
		this.tdesc = tdesc;
	}
	public Type(Integer tid, String tname, String tdesc) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.tdesc = tdesc;
	}
	public Type() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
