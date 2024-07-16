import java.util.ArrayList;
import java.util.List;

public class ChiRestaurant extends Restaurant{
	
	public ChiRestaurant(String name, 
			  String tel,
			  String location,
			  int openTime,
			  int closeTime,
			  ArrayList<Review> reviews,
			  ArrayList<Menu> menus) {
		super(name, tel, location, openTime, closeTime, reviews, menus);
	}
	
	ArrayList<Menu> menus = new ArrayList<Menu>(){{
		new Menu("짜장면", 8000, "Main", "짜장면.");
		new Menu("짬뽕", 9000, "Main", "짬뽕입니다.");
		new Menu("탕수육", 18000, "Main", "탕수육입니다.");
		new Menu("콜라", 2000, "side", "콜라입니다.");
	}};

}