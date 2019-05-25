package com.cg.MyProjectSpringBoot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.MyProjectSpringBoot.dto.Restaurant;




public interface MenuDao extends JpaRepository<Restaurant,Integer >  {
	
	public List<Restaurant> findByName(String name); 
	
	
	//public List<Restaurant> showAll();

}


