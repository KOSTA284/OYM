package com.oym.vo;

import java.util.ArrayList;

public abstract class Restaurant {
	/**
	 * 레스토랑의 정보를 저장하는 클래스
	 */
	private String name;
	private String tel; // 02-111-1111
	private String location; //시빼고, 동만
	private int openTime; // 1750 -> 17:50
	private int closeTime;
	//private String category;// "한,중,일,양"
	
	private ArrayList<Review> reviews;
	private ArrayList<Menu> menus;
	
	/**
	 * 
	 * @param name 가게 이름
	 * @param tel 가게 전화번호
	 * @param location 가게 위치
	 * @param openTime 가게 여는 시간
	 * @param closeTime 가게 닫는 시간
	 */
	public Restaurant(String name, String tel, String location, int openTime, int closeTime) {
		this.name = name;
		this.tel = tel;
		this.location = location;
		this.openTime = openTime;
		this.closeTime = closeTime;
	}
	
	/**
	 * 
	 * @param name 가게 이름
	 * @param tel 가게 전화번호
	 * @param location 가게 위치
	 * @param openTime 가게 여는 시간
	 * @param closeTime 가게 닫는 시간
	 * @param reviews 가게에 달린 리뷰들
	 * @param menus 가게에서 판매하는 메뉴들
	 */
	public Restaurant(String name, String tel, String location, int openTime, int closeTime, ArrayList<Review> reviews,
			ArrayList<Menu> menus) {
		super();
		this.name = name;
		this.tel = tel;
		this.location = location;
		this.openTime = openTime;
		this.closeTime = closeTime;
		this.reviews = reviews;
		this.menus = menus;
	}
/**
 * 
 * @return 가게 이름
 */

	public String getName() {
		return name;
	}
/**
 * 
 * @return 가게 전화번호
 */
	public String getTel() {
		return tel;
	}
/**
 * 
 * @return 가게 위치
 */
	public String getLocation() {
		return location;
	}
/**
 * 
 * @return 가게 여는 시간
 */
	public int getOpenTime() {
		return openTime;
	}
	/**
	 * 
	 * @param openTime 가게 여는 시간
	 */
	public void ChangeOpenTime(int openTime) {
		this.openTime = openTime;
	}
	/**
	 * 
	 * @return 거개 닫는 시간
	 */
	public int getCloseTime() {
		return closeTime;
	}
	/**
	 * 
	 * @param closeTime 가게 닫는 시간
	 */
	public void changeCloseTime(int closeTime) {
		this.closeTime = closeTime;
	}

/**
 * 
 * @return 가게에 달린 리뷰들
 */
	public ArrayList<Review> getReviews() {
		return reviews;
	}

/**
 * 
 * @return 가게에서 판매하는 리뷰들
 */
	public ArrayList<Menu> getMenus() {
		return menus;
	}

/**
 * 레스토랑의 정보를 리턴하는 기능
 */
	@Override
	public String toString() {
		return "Restaurant [이름: " + name + ", 전화번호: " + tel + ", 장소: " + location + ", 여는 시간: " + openTime/100+"시 "+ openTime%100+"분"
				+ ", 닫는 시간: " + closeTime/100+"시"+closeTime%100+"분" + "\n";
	}
	

}
