package com.oym.vo;

import java.util.ArrayList;

public class WesRestaurant extends Restaurant{

	public WesRestaurant(String name, 
			  String tel,
			  String location,
			  int openTime,
			  int closeTime,
			  ArrayList<Review> reviews,
			  ArrayList<Menu> menus) {
		super(name, tel, location, openTime, closeTime, reviews, menus);
	}
	
	ArrayList<Menu> menus = new ArrayList<Menu>(){{
		add(new Menu("스테이크", 70000, "Main", "스테이크입니다."));
		add(new Menu("크림파스타", 15000, "Main", "게살 크림파스타입니다."));
		add(new Menu("샐러드", 16000, "Main", "샐러드입니다."));
		add(new Menu("사이다", 2000, "side", "사이다입니다."));
	}};
}
