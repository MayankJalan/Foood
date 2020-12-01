package com.example.Foood.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cart 
{
	
	@Id
	@GeneratedValue
	int id;
	String name;
	int Price;
	int Quantity;
	
	
	
	public Cart(int id, String name, int price, int quantity)
	{
		super();
		this.id = id;   
		this.name = name;
		Price = price;
		Quantity = quantity;
	}
	public Cart()
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
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", name=" + name + ", Price=" + Price + ", Quantity=" + Quantity + "]";
	}
	


}


