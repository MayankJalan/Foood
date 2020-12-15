package com.example.Foood.model;

import java.util.List;

import javax.persistence.Entity;

public class WrapperCart {
	
	List<Cart> cartList;
     int totalAmount;
     
     
	public WrapperCart(List<Cart> cartList, int totalAmount) {
		super();
		this.cartList = cartList;
		this.totalAmount = totalAmount;
	}
	
	public WrapperCart() {}
	
	public List<Cart> getCartList() {
		return cartList;
	}
	public void setCartList(List<Cart> cartList) {
		this.cartList = cartList;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	

}
