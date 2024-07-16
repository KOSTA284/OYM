package com.oym.vo;

import java.util.ArrayList;

public class Japanese extends Restaurant{

	public Japanese(String name, String tel, String location, int openTime, int closeTime) {
		super(name, tel, location, openTime, closeTime);
	}

	public Japanese(String name, String tel, String location, int openTime, int closeTime, ArrayList<Review> reviews,
			ArrayList<Menu> menus) {
		super(name, tel, location, openTime, closeTime, reviews, menus);
		// TODO Auto-generated constructor stub
	}

}
