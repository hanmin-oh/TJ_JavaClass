package com.tjoeun.customer;

//일반 고객 정보를 기억하는 클래스
public class Customer {
	
	private int customerID; //고객 ID
	private String customerName; //고객 이름
	private String customerGrade; //고객 등급
	private int bounsPoint; //보너스 포인트
	private double bounsRatio; //보너스 포인트 적립 비율
	
	public Customer() {
		customerGrade = "SILVER";
		bounsRatio = 0.01;
		bounsPoint = bounsPoint+calcBonus(bounsPoint);
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + 
			"이며, 보너스 포인트는 " + bounsPoint + "점 입니다.";
	}
	public int calcBonus(int price) { 	//구매 금액을 인수로 넘겨받아 보너스 포인트를 계산해서 리턴하는 메소드
		return (int) (price * bounsRatio);
	}
	public int calcPrice(int price) {  //구매 금액을 넘겨받아 누적 보너스 포인트를 계산해서 리턴하는 메소드
		bounsPoint += calcBonus(price);
		return bounsPoint;
	}
	
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	public int getBounsPoint() {
		return bounsPoint;
	}
	public void setBounsPoint(int bounsPoint) {
		this.bounsPoint = bounsPoint;
	}
	public double getBounsRatio() {
		return bounsRatio;
	}
	public void setBounsRatio(double bounsRatio) {
		this.bounsRatio = bounsRatio;
	}
	
	
}
