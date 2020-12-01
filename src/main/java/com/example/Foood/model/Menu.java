package com.example.Foood.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Menu {
	
	@Id
	
	int id;
	String name;
	int Price;

	
	public Menu(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		Price = price;
	}
	

	
	
	public Menu()
	{}
	
	
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
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	
	
	@Override
	public String toString() {
		return "Menu [id=" + id + ", name=" + name + ", Price=" + Price + "]";
	}
	
	
	
	
	
	

}


