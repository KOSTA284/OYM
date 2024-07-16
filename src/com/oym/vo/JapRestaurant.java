package com.oym.vo;

import java.util.ArrayList;

public class JapRestaurant extends Restaurant{

	public JapRestaurant(String name, 
			  String tel,
			  String location,
			  int openTime,
			  int closeTime,
			  ArrayList<Review> reviews,
			  ArrayList<Menu> menus) {
		super(name, tel, location, openTime, closeTime, reviews, menus);
	}
	
	ArrayList<Menu> menus = new ArrayList<Menu>(){{
		add(new Menu("초밥", 15000, "Main", "초밥입니다."));
		add(new Menu("라멘", 10000, "Main", "라멘입니다."));
		add(new Menu("규동", 11000, "Main", "규동입니다."));
		add(new Menu("콜라", 2000, "side", "콜라입니다."));
	}};

}
