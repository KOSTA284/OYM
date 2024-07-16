package com.oym.vo;

import java.util.ArrayList;

public class KorRestaurant extends Restaurant{
	
	ArrayList<Menu> menus = new ArrayList<Menu>(){{
		new Menu("돼지국밥", 11000, "Main", "돼지국밥입니다.");
		new Menu("순대국밥", 10000, "Main", "순대국밥입니다.");
		new Menu("설렁탕", 13000, "Main", "설렁탕입니다.");
		new Menu("콜라", 2000, "side", "콜라입니다.");
	}};

	public KorRestaurant(String name, String tel, String location, int openTime, int closeTime) {
		super(name, tel, location, openTime, closeTime);
	}

}
