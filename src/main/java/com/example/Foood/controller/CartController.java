package com.example.Foood.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.Foood.model.Cart;
import com.example.Foood.service.CartService;



@RestController
public class CartController 
{
	
	
		@Autowired
		CartService cartService;
		
		@RequestMapping("/cart")
		public List <Cart> getAllMenu()
		{
			List<Cart> list =cartService.getAllCart();
			return list;
			
		}
		
		@RequestMapping("/cart/totalbill")
		public int totalbill()
		{
			List<Cart> list =cartService.getAllCart();
			int total=0;
			for (int i = 0; i < list.size(); i++) {
			    Cart ele = list.get(i);
			    total+=ele.getPrice()*ele.getQuantity();
			}
			
			return total;
			
		}
		
		@RequestMapping(method = RequestMethod.POST, value="/Cart")
		public void addCart(@RequestBody Cart cart)
		{
			cartService.addCart(cart);
		}
		
		@RequestMapping(method = RequestMethod.PUT, value="/cart/{id}")
		public void updatecart(@RequestBody Cart cart, @PathVariable int id)
		{
			cartService.updateCart(cart,id);
		}
		
		 @RequestMapping(method= RequestMethod.DELETE,value="/cart/{id}")
		    public void deleteCart(@PathVariable  int id)
		    {
		        cartService.deleteCart(id);
		    }
		
		
		

	}



