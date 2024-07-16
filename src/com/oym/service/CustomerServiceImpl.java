package com.oym.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.oym.vo.ChiRestaurant;
import com.oym.vo.Customer;
import com.oym.vo.JapRestaurant;
import com.oym.vo.KorRestaurant;
import com.oym.vo.Restaurant;
import com.oym.vo.Review;
import com.oym.vo.WesRestaurant;

public class CustomerServiceImpl implements CustomerService{
	
	private ArrayList<Restaurant> restaurants = new ArrayList<Restaurant>(){{
		add(new ChiRestaurant("만리성", "02-111-2222", "관철동", 1000, 2100, new ArrayList<Review>(){{
			add(new Review("아주 좋아요", 1, "만리성"));
			add(new Review("맛있어요", 3, "만리성"));
			add(new Review("재미있어요", 2, "만리성"));
			add(new Review("별로에요", 5, "만리성"));
			add(new Review("집에가고싶어요", 5, "만리성"));//3.2
		}}, null));
		add(new ChiRestaurant("광한루", "02-222-4444", "월곡동", 900, 2200, new ArrayList<Review>(){{
			add(new Review("아주 좋아요", 1, "광한루"));
			add(new Review("맛있어요", 3, "광한루"));
			add(new Review("재미있어요", 2, "광한루"));
			add(new Review("별로에요", 5, "광한루"));
			add(new Review("집에가고싶어요", 5, "광한루"));
			add(new Review("집에가고싶어요", 4, "광한루"));
		}}, null));
		add(new JapRestaurant("갓덴스시", "02-444-5555", "삼성동", 1100, 2100, new ArrayList<Review>(){{
			add(new Review("아주 좋아요", 1, "갓덴스시"));
			add(new Review("맛있어요", 3, "갓덴스시"));
			add(new Review("재미있어요", 2, "갓덴스시"));
			add(new Review("별로에요", 5, "갓덴스시"));//2.75
		}}, null));
		add(new JapRestaurant("코다차야", "02-888-7777", "쌍문동", 1700, 300, new ArrayList<Review>(){{
			add(new Review("아주 좋아요", 1, "코다차야"));
			add(new Review("맛있어요", 3, "코다차야"));
			add(new Review("재미있어요", 2, "코다차야"));//2
		}}, null));
		add(new KorRestaurant("이리오너라", "02-999-2699", "관철동", 700, 100, new ArrayList<Review>(){{
			add(new Review("아주 좋아요", 1, "이리오너라"));
			add(new Review("맛있어요", 3, "이리오너라"));
			add(new Review("재미있어요", 2, "이리오너라"));
			add(new Review("별로에요", 5, "이리오너라"));
			add(new Review("집에가고싶어요", 4, "이리오너라"));
			add(new Review("집에가고싶어요", 3, "이리오너라"));//3
		}}, null));
		add(new KorRestaurant("집밥", "02-465-6564", "관철동", 1000, 1100, new ArrayList<Review>(){{
			add(new Review("아주 좋아요", 1, "집밥"));
			add(new Review("맛있어요", 3, "집밥"));
			add(new Review("재미있어요", 2, "집밥"));
			add(new Review("별로에요", 2, "집밥"));
			add(new Review("집에가고싶어요", 3, "집밥"));//2.2
		}}, null));
		add(new WesRestaurant("롤링파스타", "02-886-4569", "쌍문동", 0, 2400, new ArrayList<Review>(){{
			add(new Review("아주 좋아요", 1, "롤링파스타"));
			add(new Review("맛있어요", 3, "롤링파스타"));
			add(new Review("재미있어요", 2, "롤링파스타"));
			add(new Review("별로에요", 2, "롤링파스타"));
			add(new Review("집에가고싶어요", 3, "롤링파스타"));
			add(new Review("집에가고싶어요", 4, "롤링파스타"));
			add(new Review("집에가고싶어요", 5, "롤링파스타"));
			add(new Review("집에가고싶어요", 1, "롤링파스타"));
			add(new Review("집에가고싶어요", 1, "롤링파스타"));//2.44
		}}, null));
		add(new WesRestaurant("양식이 뭐가있을까", "02-444-7768", "무슨동", 500, 1500, new ArrayList<Review>(){{
			add(new Review("아주 좋아요", 4, "양식이 뭐가있을까"));
			add(new Review("맛있어요", 3, "양식이 뭐가있을까"));
			add(new Review("재미있어요", 2, "양식이 뭐가있을까"));
			add(new Review("별로에요", 2, "양식이 뭐가있을까"));
			add(new Review("집에가고싶어요", 2, "양식이 뭐가있을까"));
			add(new Review("집에가고싶어요", 3, "양식이 뭐가있을까"));
			add(new Review("집에가고싶어요", 5, "양식이 뭐가있을까"));//3
		}}, null));
	//메뉴 작성 추후에
		
	}	};
	private static CustomerServiceImpl service = new CustomerServiceImpl();
	private CustomerServiceImpl(){ // 싱글톤 작성
		
	}
	
	public static CustomerServiceImpl getInstance() {
		return service;
	}

	private List<Customer> customers = new ArrayList<>() {
		{
			add(new Customer("111", "abc","김지남","쌍문동","한식", 30, true));
			add(new Customer("222", "erf","박시우","삼성동","양식", 20, false));
			add(new Customer("333", "adfd","신승현","관철동","중식", 50, true));
			add(new Customer("444", "sdfd111","이찬영","월곡동","일식", 40, false));
			add(new Customer("555", "df22","황선민","월곡동","한식", 20, true));
		}
	};
	public List<Customer> getAllCustomer(){
		return customers;
	}

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
	public ArrayList<Restaurant> findAllRestaurant() {
		
		return restaurants;
	}

	@Override
	// 한식,양식,중식 입력받아서 해당하는 레스토랑 리스트 리턴
	public ArrayList<Restaurant> findRestaurantByCategory(String category) {
		ArrayList<Restaurant> t= new ArrayList<Restaurant>();
		switch(category) {
		case "한식": 
			for(Restaurant r : restaurants) { if(r instanceof KorRestaurant) t.add(r);}
			break;
		case "일식": 
			for(Restaurant r : restaurants) { if(r instanceof JapRestaurant) t.add(r);}
			break;
		case "양식": 
			for(Restaurant r : restaurants) { if(r instanceof WesRestaurant) t.add(r);}
			break;
		case "중식": 
			for(Restaurant r : restaurants) { if(r instanceof ChiRestaurant) t.add(r);}
			break;
		}
		return t;
	}

	@Override
	public ArrayList<Restaurant> findRestaurantByLocation(String location) {
		ArrayList<Restaurant> t= new ArrayList<Restaurant>();
		for(Restaurant r : restaurants) {
			if(r.getLocation().equals(location)) t.add(r);
		}
		return t;
	}

	@Override
	public ArrayList<Restaurant> findRestaurantByName(String name) {
		ArrayList<Restaurant> t= new ArrayList<Restaurant>();
		for(Restaurant r : restaurants) {
			if(r.getName().contains(name)) t.add(r);
		}
		return t;
	}

	@Override
	public List<Restaurant> recommendRestaurantByAddress(Customer customer) {
		List<Restaurant> aRestaurants = new ArrayList();
		for(Restaurant restaurant : restaurants) {
			if(restaurant.getLocation().equals(customer.getAddress())) aRestaurants.add(restaurant);
		}
		Collections.sort(aRestaurants, new Comparator<Restaurant>() {

			@Override
			public int compare(Restaurant r1, Restaurant r2) {
				return r2.getName().compareTo(r1.getName());
			}
			
		});
		return aRestaurants;
	}

	@Override
	public List<Restaurant> recommendRestaurantByCategory(Customer customer) {
		List<Restaurant> cRestaurants = new ArrayList();
		for(Restaurant restaurant : restaurants) {
			switch (customer.getFavorite()) {
			case "한식": {
				if(restaurant instanceof KorRestaurant) cRestaurants.add(restaurant);
				break;
			}case "중식": {
				if(restaurant instanceof ChiRestaurant) cRestaurants.add(restaurant);
				break;
			}case "일식": {
				if(restaurant instanceof JapRestaurant) cRestaurants.add(restaurant);
				break;
			}case "양식": {
				if(restaurant instanceof WesRestaurant) cRestaurants.add(restaurant);
				break;
			}}
		}
		Collections.sort(cRestaurants, new Comparator<Restaurant>() {

			@Override
			public int compare(Restaurant r1, Restaurant r2) {
				return r2.getName().compareTo(r1.getName());
			}
			
		});
		return cRestaurants;
	}

	@Override
	public Map<Restaurant, Double> recommendRestaurantByRating() {
		List<Restaurant> raRestaurants = new ArrayList();
		Map<Restaurant, Double> raRestaurant = new HashMap<Restaurant, Double>();
		for(Restaurant r : restaurants) {
			raRestaurant.put(r, 0.0);
		}
		for(int i = 0 ; i < restaurants.size() ; i++) {
			int sum = 0;
			for(Review r : restaurants.get(i).getReviews()) {
				raRestaurant.put(restaurants.get(i), raRestaurant.get(restaurants.get(i))+r.getRating());
				sum++;
			}
			raRestaurant.put(restaurants.get(i), raRestaurant.get(restaurants.get(i))/sum);
		}
		return raRestaurant;
	}

	@Override
	public List<Restaurant> recommendRestaurantByReviews() {
		List<Restaurant> reRestaurants = restaurants;
		Collections.sort(reRestaurants, new Comparator<Restaurant>() {

			@Override
			public int compare(Restaurant r1, Restaurant r2) {
				return r2.getReviews().size() - r1.getReviews().size();
			}
			
		});
		return reRestaurants;
	}

	@Override
	public List<Restaurant> recommendRestaurantByGender(Customer customer) {
//		List<Restaurant> greRestaurants = new ArrayList();
//		for(Restaurant restaurant : restaurants) {
//			if(restaurant.get().equals(customer.getAddress())) aRestaurants.add(restaurant);
//		}
//		Collections.sort(aRestaurants, new Comparator<Restaurant>() {
//
//			@Override
//			public int compare(Restaurant r1, Restaurant r2) {
//				return r2.getName().compareTo(r1.getName());
//			}
//			
//		});
		return null;
	}

	@Override
	public List<Restaurant> recommendRestaurantByAge(Customer customer) {
		return null;
	}



}
