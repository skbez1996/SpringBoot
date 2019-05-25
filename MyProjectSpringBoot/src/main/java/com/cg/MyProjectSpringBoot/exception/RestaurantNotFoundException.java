package com.cg.MyProjectSpringBoot.exception;

public class RestaurantNotFoundException extends Exception{

	public RestaurantNotFoundException() {
		
		super();
	
	}

	public RestaurantNotFoundException(String msg) {
		
		super(msg);
		
	}
}
