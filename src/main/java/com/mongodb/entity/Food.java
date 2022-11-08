package com.mongodb.entity;

public class Food {
	private int fid;
	private String fname;
	private int fprice;
	private int id;
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Food(int fid, String fname, int fprice, int id) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.fprice = fprice;
		this.id = id;
	}
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
	public int getFprice() {
		return fprice;
	}
	public void setFprice(int fprice) {
		this.fprice = fprice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
