package com.slokam;

public class person {
	
	private Integer pid;
	private String pname;
	private Integer page;
	private String pqual;
	
	
	@Override
	public String toString() {
		return "person [pid=" + pid + ", pname=" + pname + ", page=" + page + ", pqual=" + pqual + "]";
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public String getPqual() {
		return pqual;
	}
	public void setPqual(String pqual) {
		this.pqual = pqual;
	}

}
