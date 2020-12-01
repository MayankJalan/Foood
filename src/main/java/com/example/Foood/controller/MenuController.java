package com.example.Foood.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Foood.model.Menu;
import com.example.Foood.service.MenuService;

@RestController
public class MenuController {
	
	@Autowired
	MenuService menuService;
	
	@RequestMapping("/menu")
	public List <Menu> getAllMenu()
	{
		return menuService.getAllmenu();
		
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/menu")
	public void addMenu(@RequestBody Menu menu)
	{
		menuService.addMenu(menu);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/menu/{id}")
	public void addMenu(@RequestBody Menu menu, @PathVariable int id)
	{
		menuService.updateMenu(menu,id);
	}
	
	 @RequestMapping(method= RequestMethod.DELETE,value="/menu/{id}")
	    public void deleteTopic(@PathVariable  int id)
	    {
	        menuService.deleteMenu(id);
	    }
	
	
	

}
