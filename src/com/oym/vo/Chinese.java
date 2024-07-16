package com.oym.vo;

import java.util.ArrayList;

public class Chinese extends Restaurant{

	public Chinese(String name,
				   String tel,
				   String location,
				   int openTime,
				   int closeTime,
				   ArrayList<Review> reviews,
				   ArrayList<Menu> menus) {
		super(name, tel, location, openTime, closeTime, reviews, menus);
	}

}
