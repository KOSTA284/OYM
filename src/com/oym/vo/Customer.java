package com.oym.vo;

public class Customer{
	
	private String id;
	private String pw;
	private String name;
	private String address;
	private String favorite;
	private int age;
	private boolean isMan;

	public Customer(String id, String pw, String name, String address, String favorite, int age, boolean isMan) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.address = address;
		this.favorite = favorite;
		this.age = age;
		this.isMan = isMan;
	}
	
	public String getPw() {
		return pw;
	}
	public String getId() {
		return id;
	}

	public void changePw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getFavorite() {
		return favorite;
	}

	public void changeFavorite(String favorite) {
		this.favorite = favorite;
	}

	public void changeAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public boolean isMan() {
		return isMan;
	}
	
}
