package com.oym.service;

import java.util.ArrayList;

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
	
	Restaurant[] recommendRestaurantByAddress(Customer customer);
	Restaurant[] recommendRestaurantByCategory(Customer customer);
	Restaurant[] recommendRestaurantByRating(Customer customer);
	Restaurant[] recommendRestaurantByReviews(Customer customer);
	Restaurant[] recommendRestaurantByGender(Customer customer);
	Restaurant[] recommendRestaurantByAge(Customer customer);

}
