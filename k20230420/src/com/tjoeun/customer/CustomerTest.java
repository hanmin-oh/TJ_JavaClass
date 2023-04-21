package com.tjoeun.customer;

public class CustomerTest {
	
	public static void main(String[] args) {
		
		//일반 고객 객체 생성
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("이순신");
		customerLee.setBounsPoint(1000);
		
		System.out.println("회원 정보: " + customerLee.showCustomerInfo());
		System.out.println("보너스 포인트:" + customerLee.calcBonus(35000));
		System.out.println("누적 보너스 포인트:" + customerLee.calcPrice(35000));
		
		
		//우수 고객 객체 생성
		VIPCoustomer costomerPark = new VIPCoustomer();
		costomerPark.setCustomerID(10011);
		costomerPark.setCustomerName("박이정");
		costomerPark.setBounsPoint(10000);
		System.out.println(costomerPark.showCustomerInfo());
		System.out.println("실제 구매 금액:" +costomerPark.calcSales(100000));
		System.out.println("보너스 포인트: " + costomerPark.calcBonus(100000));
		System.out.println("누적 보너스 포인트: " + costomerPark.calcPrice(100000));
		
	}
	
}
