package com.oym.service;

import java.util.ArrayList;
import java.util.List;

import com.oym.vo.Customer;
import com.oym.vo.Restaurant;

public interface CustomerService {
	
	/**
	 * 회원가입을 하는 기능
	 * @param 회원가입할 사용자의 정보
	 * */
	void register(Customer customer);
	/**
	 * 특정한 회원을 찾아주는 기는
	 * @param 찾고자 하는 사용자의 id
	 * @return 전달받은 id와 일치하는 사람의 회원정보
	 * */
	Customer findCustomer(String id);
	/**
	 * 사용자의 정보를 수정하는 기능
	 * password와 address와 선호하는 category만 변경 가능
	 * @param 수정할 사용자의 정보
	 * */
	void updateCustomer(Customer user);
	/**
	 * 사용자의 정보를 삭제하는 기능
	 * @param 회원탈퇴할 사용자의 정보
	 * */
	void deleteCustomer(String id);
	
	
	/**
	 * 모든 맛집의 정보를 보여주는 기능
	 * @return 프로그램에 저장된 모든 맛집들의 리스트
	 * */
	ArrayList<Restaurant> findAllRestaurant();
	/**
	 * 사용자가 궁금해하는 category에 속하는 맛집들을 보여주는 기능
	 * @return 사용자가 궁금해하는 category에 속하는 맛집들의 리스트
	 * @param 사용자가 검색한 카테고리
	 * */
	ArrayList<Restaurant> findRestaurantByCategory(String category);
	/**
	 * 사용자가 궁금해하는 지역에 속하는 맛집들을 보여주는 기능
	 * @return 사용자가 궁금해하는 지역에 속하는 맛집들의 리스트
	 * @param 사용자가 검색한 지역
	 * */
	ArrayList<Restaurant> findRestaurantByLocation(String location);
	/**
	 * 사용자가 궁금해하는 가게이름이 포함된 맛집들을 보여주는 기능
	 * @return 사용자가 궁금해하는 가게이름이 포함된 맛집들의 리스트
	 * @param 사용자가 검색한 가게이름
	 * */
	ArrayList<Restaurant> findRestaurantByName(String name );
	
	
	/**
	 * 사용자가 회원가입했을때 입력한 주소 근처의 맛집들을 추천해주는 기능
	 * @param 로그인한 사용자의 정보
	 * @return 사용자 근처의 맛집 리스트
	 * */
	List<Restaurant> recommendRestaurantByAddress(Customer customer);
	/**
	 * 사용자가 선호하는 종류의 맛집들을 추천해주는 기능
	 * @param 로그인한 사용자의 정보
	 * @return 사용자가 선호하는 종류의 맛집 리스트
	 * */
	List<Restaurant> recommendRestaurantByCategory(Customer customer);
	/**
	 * 리뷰에 작성된 별점들의 평균이 높은순으로 맛집을 추천해주는 기능
	 * @param 로그인한 사용자의 정보
	 * @return 리뷰에 작성된 별점들의 평균이 높은순으로 정렬된 맛집 리스트
	 * */
	List<Restaurant> recommendRestaurantByRating(Customer customer);
	/**
	 * 작성된 리뷰가 많은 순으로 맛집을 추천해주는 기능
	 * @param 로그인한 사용자의 정보
	 * @return 작성된 리뷰가 많은 순으로 정렬된 맛집 리스트
	 * */
	List<Restaurant> recommendRestaurantByReviews(Customer customer);
	/**
	 * 리뷰를 작성한 사람들의 성별과 로그인된 사용자의 성별이 비슷한순으로 맛집을 추천해주는 기능
	 * @param 로그인한 사용자의 정보
	 * @return 리뷰를 작성한 사람들의 성별과 로그인된 사용자의 성별이 비슷한순으로 정렬된 맛집 리스트
	 * */
	List<Restaurant> recommendRestaurantByGender(Customer customer);
	/**
	 * 리뷰를 작성한 사람들의 연령대와 로그인된 사용자의 연령대가 비슷한순으로 맛집을 추천해주는 기능
	 * @param 로그인한 사용자의 정보
	 * @return 리뷰를 작성한 사람들의 연령대와 로그인된 사용자의 연령대가 비슷한순으로 정렬된 맛집 리스트
	 * */
	List<Restaurant> recommendRestaurantByAge(Customer customer);

}
