package com.oym.vo;

public class Review {
	
	private String comment;
	private int rating;  // 1-5점만
	private String restaurantName;
	
	public Review(String comment, int rating, String restaurantName) {
		this.comment = comment;
		this.rating = rating;
		this.restaurantName = restaurantName;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getRating() {
		return rating;
	}

	public String getRestaurantName() {
		return restaurantName;
	}


}
