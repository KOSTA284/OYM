package com.oym.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.oym.service.CustomerServiceImpl;
import com.oym.vo.Customer;

public class OYMAppTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CustomerServiceImpl mgr = CustomerServiceImpl.getInstance();
		//싱글톤
		

		mainWhile : while(true) //main 표시
		{
			System.out.println("");
			System.out.println("=============================");
			System.out.println("");
			
			String[] O = {
	            "  ####  ",
	            " #    # ",
	            "#      #",
	            "#      #",
	            "#      #",
	            " #    # ",
	            "  ####  "
	        };

	        String[] Y = {
	            "#     #",
	            " #   # ",
	            "  # #  ",
	            "   #   ",
	            "   #   ",
	            "   #   ",
	            "   #   "
	        };

	        String[] M = {
	            "#     #",
	            "##   ##",
	            "# # # #",
	            "#  #  #",
	            "#     #",
	            "#     #",
	            "#     #"
	        };

	        for (int i = 0; i < O.length; i++) {
	            System.out.println(O[i] + "  " + Y[i] + "  " + M[i]);
	        }
	        
			System.out.println("                  ");                     
			System.out.println("           /\\_/\\");                     
		  System.out.println("          ( o.o ) ");
		  System.out.println("           > ^ <  ");
		    
			System.out.println("");
			System.out.println("=============================");
			System.out.println("");
			

			String main = "";
			main += "<<OYM : 맛집 검색 서비스>>\n";
			main += "번호를 선택하세요\n";
			main += "1 : 로그인\n";
			main += "2 : 회원가입\n";
			main += "0 : 종료\n";

			System.out.println(main);
			
			int selectMain = sc.nextInt(); //번호 입력받기
			
			mainSwitch : switch(selectMain){
			case 0: 
				break mainWhile;
			case 1:
				System.out.println("ID 입력 : ");
				String id = sc.next();
				System.out.println("PW 입력 : ");
				String pw = sc.next();
				
				List<Customer> customerList = mgr.getAllCustomer();
				
				Customer customer = null;
				
				for(Customer c : customerList) {
					if(c.getId().equals(id) && c.getPw().equals(pw)) {
						System.out.println("로그인 성공!");
						customer = c;
						
						menuWhile : while(true)
						{
							String menu = "";
							menu +=	"<<MENU>>\n";
							menu +=	"번호를 선택하세요\n";
							menu += "1 : 맛집 검색\n";
							menu += "2 : 맛집 추천\n";
							menu += "3 : 회원 정보 수정\n";
							menu += "0 : 로그아웃\n";

							System.out.println(menu);
							
							int selectMenu = sc.nextInt();
							
							menuSwitch : switch(selectMenu){
							case 0:
								break menuWhile;
							case 1:
								findWhile : while(true)
								{
									String find = "";
									find +=	"<<맛집 검색>>\n";
									find +=	"번호를 선택하세요\n";
									find += "1 : 모든 맛집 보기\n";
									find += "2 : 카테고리로 맛집 검색 (한식|중식|일식|양식)\n";
									find += "3 : 장소로 맛집 검색 (~동)\n";
									find += "4 : 식당 이름으로 맛집 검색\n";
									find += "0 : MENU로 돌아가기\n";

									System.out.println(find);
									
									int selectFind = sc.nextInt();
									
									findSwitch : switch(selectFind){
									case 0:
										break findWhile;
									case 1:
										System.out.println("<<모든 맛집 보기>>");
										System.out.println(mgr.findAllRestaurant());
										break findSwitch;
									case 2:
										System.out.println("<<카테고리로 맛집 검색 (한식|중식|일식|양식)>>");
										System.out.println("검색할 카테고리 입력 : ");
										String category = sc.next();
										if(category.equals("한식") || category.equals("중식") || category.equals("일식") || category.equals("양식")) {
											System.out.println(mgr.findRestaurantByCategory(category));
										}else {
											System.out.println("한식|중식|일식|양식 중에서 입력해 주세요"); //(수정 필요)
										}
											
										break findSwitch;
									case 3:
										System.out.println("<<장소로 맛집 검색 (~동)>>");
										System.out.println("검색할 장소 입력 : ");
										String location = sc.next();
										System.out.println(mgr.findRestaurantByLocation(location));
										break findSwitch;
									case 4:
										System.out.println("<<식당 이름으로 맛집 검색>>");
										System.out.println("검색할 식당 이름 입력 : ");
										String name = sc.next();
										System.out.println(mgr.findRestaurantByName(name));
										break findSwitch;
									}//findSwitch
								}//findWhile
							case 2:
								recommendWhile : while(true)
								{
									String recommend = "";
									recommend +=	"<<맛집 추천>>\n";
									recommend +=	"번호를 선택하세요\n";
									recommend += "1 : 가까운 맛집 추천\n";
									recommend += "2 : 가장 좋아하는 카테고리로 맛집 추천 (한식|중식|일식|양식)\n";
									recommend += "0 : MENU로 돌아가기\n";

									System.out.println(recommend);
									
									int selectrecommend = sc.nextInt();
									
									recommendSwitch : switch(selectrecommend){
									case 0:
										break recommendWhile;
									case 1:
										System.out.println("<<가까운 맛집 추천>>");
										System.out.println(mgr.recommendRestaurantByAddress(customer));
										break recommendSwitch;
									case 2:
										System.out.println("<<가장 좋아하는 카테고리로 맛집 추천 (한식|중식|일식|양식)>>");
										System.out.println(mgr.recommendRestaurantByCategory(customer));
										break recommendSwitch;
									}//recommendSwitch
								}//recommendWhile
							case 3:
								userwhile : while(true)
								{
									String user = "";
									user +=	"<<회원정보 수정>>\n";
									user +=	"번호를 선택하세요\n";
									user += "1 : 정보 수정\n";
									user += "2 : 회원 탈퇴\n";
									user += "0 : MENU로 돌아가기\n";

									System.out.println(user);
									
									int selectUser = sc.nextInt();
									
									userSwitch : switch(selectUser){
									case 0:
										break userwhile;
									case 1:
										System.out.println("<<정보 수정>>");
										System.out.println("주소와 PW만 수정 가능합니다");
										
										System.out.println("수정할 주소 입력 : ");
										String changedAddress = sc.next();
										customer.changeAddress(changedAddress);
										
										System.out.println("수정할 PW 입력 : ");
										String changedPw = sc.next();
										customer.changePw(changedPw);
										
										System.out.println("회원 정보가 수정되었습니다");
										System.out.println("================== 수정 후 회원 정보 ==================");
										System.out.println(customer.toString());
                      
									case 2:
										System.out.println("<<회원 탈퇴>>");
										System.out.println("탈퇴하실 회원의 ID 입력 : ");
										String checkOutId = sc.next();
										if(checkOutId.equals(customer.getId())) {
											mgr.deleteCustomer(checkOutId);
											System.out.println("[" + checkOutId + "] 님의 회원 탈퇴가 완료되었습니다");
										}else {
											System.out.println("ID를 다시 입력해 주세요"); //(수정 필요)
										}
									}//userSwitch
								}//userwhich
							}//menuSwitch
						}//menuWhile
					}//if
				}//for
			case 2:
				System.out.println("<<회원가입>>");
				System.out.println("ID 입력 : ");
				String registerId = sc.next();
