package com.mongodb.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "restorent")
public class Restorent {
	
	private int id;
	private String name;
	private String city;
	
	List<Food> list  =new  ArrayList<>();
	
	public Restorent(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}



	public Restorent(int id, String name, String city, List<Food> list) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.list = list;
	}



	public List<Food> getList() {
		return list;
	}



	public void setList(List<Food> list) {
		this.list = list;
	}
	
	

}
