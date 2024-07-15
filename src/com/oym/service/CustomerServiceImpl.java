package com.oym.service;

import com.oym.vo.Customer;
import com.oym.vo.Restaurant;

public class CustomerServiceImpl implements CustomerService{
	
	CustomerServiceImpl(){ // 싱글톤 작성
		
	}

	@Override
	public void register(Customer customer) {
		
	}

	@Override
	public Customer findCustomer(String id) {
		return null;
	}

	@Override
	public void updateCustomer(Customer user) {
		
	}

	@Override
	public void deleteCustomer(String id) {
		
	}

	@Override
	public Restaurant[] findAllRestaurant() {
		return null;
	}

	@Override
	public Restaurant[] findRestaurantByCategory(String category) {
		return null;
	}

	@Override
	public Restaurant[] findRestaurantByLocation(String location) {
		return null;
	}

	@Override
	public Restaurant findRestaurantByName(String name) {
		return null;
	}

	@Override
	public Restaurant[] recommendRestaurantByAddress(Customer customer) {
		return null;
	}

	@Override
	public Restaurant[] recommendRestaurantByCategory(Customer customer) {
		return null;
	}

	@Override
	public Restaurant[] recommendRestaurantByRating(Customer customer) {
		return null;
	}

	@Override
	public Restaurant[] recommendRestaurantByReviews(Customer customer) {
		return null;
	}

	@Override
	public Restaurant[] recommendRestaurantByGender(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Restaurant[] recommendRestaurantByAge(Customer customer) {
		return null;
	}



}
