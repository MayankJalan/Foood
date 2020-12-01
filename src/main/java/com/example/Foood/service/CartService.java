package com.example.Foood.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Foood.model.Cart;
import com.example.Foood.repo.CartRepository;


@Service
public class CartService {
	
	@Autowired
	CartRepository cartrepository;

	public List<Cart> getAllCart() 
	{
		List<Cart> t=new ArrayList<>();
        cartrepository.findAll().forEach(t :: add);;
        return t;
		
	}

	public void addCart(Cart cart) {
		
			cartrepository.save(cart);
	
		
	}

	public void updateCart(Cart cart, int id) 
	{
		
		cartrepository.save(cart);
		
			
	}

	public void deleteCart(int id) {
		cartrepository.delete(id);
	}

}
