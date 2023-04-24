package com.tjoeun.interfaceTest3;

public abstract class Calculator implements Calc {

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	@Override
	public void description(int number) {
		System.out.println("Calc 인터페이스의 default 메소드를 Calculator 클래스에서 " + 
			"Override한 메소드");
	}

	@Override
	public int sub(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}
	
	//mul , div 메소드는 무조건 사용할 것이 아니기 때문에 오버라이드 하지 않고 추상클래스화 시킨다.
	
	
	
	
	
}
