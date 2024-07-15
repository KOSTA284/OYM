package com.oym.service;

import com.oym.vo.Customer;
import com.oym.vo.Restaurant;

public interface CustomerService {
	
	void register(Customer customer); //회원가입
	Customer findCustomer(String id);
	void updateCustomer(Customer user);
	void deleteCustomer(String id);
	
	Restaurant[] findAllRestaurant();
	Restaurant[] findRestaurantByCategory(String category);
	Restaurant[] findRestaurantByLocation(String location);
	Restaurant findRestaurantByName(String name );
	
	Restaurant[] recommendRestaurantByAddress(Customer customer);
	Restaurant[] recommendRestaurantByCategory(Customer customer);
	Restaurant[] recommendRestaurantByRating(Customer customer);
	Restaurant[] recommendRestaurantByReviews(Customer customer);
	Restaurant[] recommendRestaurantByGender(Customer customer);
	Restaurant[] recommendRestaurantByAge(Customer customer);

}
