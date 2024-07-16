package com.oym.service;

import java.util.ArrayList;
import java.util.List;

import com.oym.vo.Customer;
import com.oym.vo.Restaurant;

public interface CustomerService {
	
	void register(Customer customer); //회원가입
	Customer findCustomer(String id);
	void updateCustomer(Customer user);
	void deleteCustomer(String id);
	
	ArrayList<Restaurant> findAllRestaurant();
	ArrayList<Restaurant> findRestaurantByCategory(String category);
	ArrayList<Restaurant> findRestaurantByLocation(String location);
	ArrayList<Restaurant> findRestaurantByName(String name );
	
	List<Restaurant> recommendRestaurantByAddress(Customer customer);
	List<Restaurant> recommendRestaurantByCategory(Customer customer);
	List<Restaurant> recommendRestaurantByRating(Customer customer);
	List<Restaurant> recommendRestaurantByReviews(Customer customer);
	List<Restaurant> recommendRestaurantByGender(Customer customer);
	List<Restaurant> recommendRestaurantByAge(Customer customer);

}
