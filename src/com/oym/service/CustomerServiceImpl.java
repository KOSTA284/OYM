package com.oym.service;

import java.util.ArrayList;

import com.oym.vo.Customer;
import com.oym.vo.Restaurant;

public class CustomerServiceImpl implements CustomerService{
	
	private static CustomerServiceImpl service = new CustomerServiceImpl();
	
	private CustomerServiceImpl(){ }
	
	public static CustomerServiceImpl getInstance() {
		return service;
	}
	
	ArrayList<Customer> customers = new ArrayList<>();
	

	@Override
	public void register(Customer customer) {
		customers.add(customer);
		
	}

	@Override
	public Customer findCustomer(String id) {
		
		Customer c = null;
		for(Customer tmp : customers) {
			if( tmp.getId() == id) {
				c = tmp;
				break;
			}
		}
		
		return c;
	}

	@Override
	public void updateCustomer(Customer user) {

		for(int i=0; i<customers.size(); i++) {
			if( customers.get(i).getId() == user.getId()) {
				customers.get(i).changeAddress(user.getAddress());
				customers.get(i).changePw(user.getPw());
				customers.get(i).changeFavorite(user.getFavorite());
				break;
			}
		}
		
	}

	@Override
	public void deleteCustomer(String id) {
		
		for(int i=0; i<customers.size(); i++) {
			if(customers.get(i).getId() == id) {
				customers.remove(i);
				break;
			}
		}
		
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
