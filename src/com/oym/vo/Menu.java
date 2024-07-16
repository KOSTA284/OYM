package com.oym.vo;

public class Menu {
	private String name;
	private int price;
	private String subCategory;
	private String summary;
	
	
	public Menu(String name, int price, String subCategory, String summary) {
		super();
		this.name = name;
		this.price = price;
		this.subCategory = subCategory;
		this.summary = summary;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getSubCategory() {
		return subCategory;
	}


	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}


	public String getSummary() {
		return summary;
	}


	public void setSummary(String summary) {
		this.summary = summary;
	}
}
