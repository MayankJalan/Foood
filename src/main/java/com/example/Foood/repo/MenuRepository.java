package com.example.Foood.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Foood.model.Menu;

public interface MenuRepository extends JpaRepository<Menu, Integer> 
{

}
