package com.example.Foood.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Foood.model.Menu;
import com.example.Foood.repo.MenuRepository;


@Service
public class MenuService {
	
	@Autowired
	private MenuRepository menurepository;
	
	
	
	public List <Menu>  getAllmenu()
	{
		List<Menu> t=new ArrayList<>();
        menurepository.findAll().forEach(t :: add);;
        return t;
		
	}

	public void addMenu(Menu menu) 
	{
		menurepository.save(menu);
				
	}

	public void updateMenu(Menu menu, int id) 
	{
		
		menurepository.save(menu);
	}

	public void deleteMenu(int id) {
		menurepository.delete(id);;
		
	}
	
	
	
	
	
	

}
