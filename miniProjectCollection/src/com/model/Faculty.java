package com.model;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
	
	private int fid;
	private  String fname;
	private List<Course> clist=new ArrayList<>();
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public List<Course> getClist() {
		return clist;
	}
	public void setClist(List<Course> clist) {
		this.clist = clist;
	}
	

}
