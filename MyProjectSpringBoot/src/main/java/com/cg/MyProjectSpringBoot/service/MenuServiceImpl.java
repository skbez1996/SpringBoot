package com.cg.MyProjectSpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.MyProjectSpringBoot.dao.MenuDao;
import com.cg.MyProjectSpringBoot.dto.Item;
import com.cg.MyProjectSpringBoot.dto.Restaurant;

@Service
public class MenuServiceImpl implements MenuService{
	@Autowired
	MenuDao menudao;

	@Override
	public Restaurant add(Restaurant restaurant) {
		
		return menudao.save(restaurant);
	}

	@Override
	public List<Restaurant> findByName(String name) {
		
		return menudao.findByName(name);
	}

	@Override
	public List<Restaurant> showRestaurant() {
		return menudao.findAll();
	}


}
