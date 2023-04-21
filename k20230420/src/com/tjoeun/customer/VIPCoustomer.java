package com.tjoeun.customer;

//우수 고객 정보를 기억하는 클래스
//이미 Customer 클래스에서 구현한 내용과 중복되므로 Customer 클래스를
//상속받아 만든다. 
public class VIPCoustomer extends Customer {
	
	/*일반 고객 정보에는 없고 우수 고객 정보에만 있을 필드를 선언한다.
	1:1 상담원이 배정되고 제품을 살 때 가격의 10%를 할인해 주고 보너스 포인트를 5%를 적립한다.
	*/
	
	private int agentID; //담당상담원 ID
	private double salseRatio; //추가 할인 비율
	
	public VIPCoustomer() {
		//private 권한의 필드에 접근할 수 없으므로 상속받은 setter로 VIP 고객 정보를 넣어준다.
		setCustomerGrade("VIP");
		setBounsRatio(0.05);
		salseRatio = 0.1;
	}
	
	public int calcSales(int price) { //실제 구매 금액을 계산해서 리턴하는 메소드
		return (int) (price * (1 - salseRatio));
	}
	
	/*
	-Customer 클래스에서 상속받은 calcBonus() 메소드는 할인전 금액에 대한 보너스 포인트를 계산하기 때문에 VUP고객은 할인율이 
	적용된 실제 구매금액에  대한 보너스 포인트를 계산할 수 없다.
	-Customer 클래스에서 상속받은 calcBonus()를 사용하면 올바른 계산결과를 얻을 수 없기 때문에 Override 해서 구현한다.
	*/
	@Override
	public int calcBonus(int price) {
		return (int) (calcSales(price)*getBounsRatio());
	}
	
	
	
	
	
}
