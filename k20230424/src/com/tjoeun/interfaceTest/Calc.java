package com.tjoeun.interfaceTest;

// 인터페이스는 클래스나 프로그램이 제공하는 기능을 명시적으로 선언한다.
// 일종의 클라이언트 코드와의 약속이며 클래스나 프로그램이 제공하는 기능들의 명세
// 클라이언트 프로그램은 인터페이스에 선언된 메소드나 명세만 보고 이를 구현한 클래스를 
// 사용할 수 있다.
// 인터페이스로 구현한 다양한 객체를 생성한다. => 다형성

public interface Calc {
	
	public static final double PI = 3.14592;
	int ERROR = -99999999; //public static final 자동으로 붙여줌
	
	public abstract int add(int num1, int num2); //추상메소드
	int sub(int num1, int num2); //public abstract 자동으로 붙여줌, 뺼샘
	int mul(int num1, int num2); 
	int div(int num1, int num2); 
	
	
	
	
}
