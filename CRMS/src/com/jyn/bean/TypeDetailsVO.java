package com.jyn.bean;

public class TypeDetailsVO {
	private Integer tid;
	private String tname;
	private String tdesc;
	private String dname;
	private String ddesc;
	private String addr;
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
	public TypeDetailsVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TypeDetailsVO(Integer tid, String tname, String tdesc, String dname,
			String ddesc, String addr) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.tdesc = tdesc;
		this.dname = dname;
		this.ddesc = ddesc;
		this.addr = addr;
	}
	
	
}
