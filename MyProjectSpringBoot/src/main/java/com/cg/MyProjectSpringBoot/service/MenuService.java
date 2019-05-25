package com.cg.MyProjectSpringBoot.service;

import java.util.List;

import com.cg.MyProjectSpringBoot.dto.Restaurant;



public interface MenuService {
	/*public Restaurant addRestaurant(Restaurant res);
	public List<Restaurant> showAll();*/
	public Restaurant add(Restaurant restaurant) ;
	public List<Restaurant> findByName(String name);
	public List<Restaurant> showRestaurant();
}
   