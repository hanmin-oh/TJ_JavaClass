package com.tjoeun.abstractClass;

class Base {
	
	//접근 권한 생략하면 package : 접근 권한은 같은 package 에서는 public 처럼 사용되고 다른 package에서는 private처럼 사용된다.
	String name;
	void say() {
		System.out.println(name + "님 안녕하세요.");
	}
}

class Sub extends Base {
	
	int age;
	@Override
	void say() {
		//super.say(); //super -- 부모클래스의 say클래스 실행하라!
		System.out.println(name + "님은 " + age + "살 입니다.");
	}
}

public class UpDownCastingTest {
	
	public static void main(String[] args) {
		
		//부모 클래스 타입으로 부모 클래스 객체를 만들어 사용하면 아무 문제없이 처리된다.
		Base base = new Base();
		base.name = "이순신";
		base.say();
		System.out.println("======================");
		
		//자식 클래스 타입으로 자식 클래스 객체를 만들어 사용하면 아무 문제없이 처리된다.
		Sub sub = new Sub();
		sub.name = "을지문덕";
		sub.age = 51;
		sub.say();
		System.out.println("======================");
		
		/* 
		 - 부모 클래스가 자식 클래스를 제어할 수 있지만 자식 클래스가 부모 클래스를 제어할 수 없다.
		 - 부모 클래스 타입에 자식 클래스 타입의 객체가 생성된 주소를 대입하면 아무 문제없이 처리된다.
		 Base b = new Sub(); //자식 클래스로 정상 실행
		 b.say(); //C++은 부모 클래스가 실행
		 - 자식 클래스 타입에 부모 클래스 타입의 객체가 생성된 주소를 대입하면?
		 Sub s = new Base(); //--에러가 난다.  */
		
		/*
		 - 부모 클래스 타입의 객체에 자식 클래스 타입의 객체가 생성된 주소를 대입한다. => upcasting
		 - downcasting은 부모 클래스 타입으로 upcasting된 자식 클래스를 다시 자식 클래스 타입으로
		 변환하는 것을 말한다.
		 Base b = sub();
		 - b는 부모 클래스 타입의 객체지만 자식 클래스 타입의 객체가 생성된 주소를 대입햇으므로 
		 say()라는 메소드를 실행하면 부모 클래스의 say() 메소드가 아닌 자식 클래스의 say() 메소드가
		 실행된다.
		 b.say();   */
		
		/*자식 클래스 타입의 객체에 부모 클래스 타입의 객체가 생성된 주소를 대입한다.
		Sub s = Base; --에러발생  */
		
		/*
		자식 클래스 타입에 부모 클래스 타입의 객체나 생성된 주소를 대입하면 에러가 발생되는데
		이 때, casting 시켜서 대입하면 대입이 가능하다. 이 경우 정상적인 downcasting이 아닌 경우
		문법적으로 오류는 발생하지 않지만 ClassCastException이 발생된다. 
		Sub s = (Sub) base; --casting 시키면 문법적인 에러는 발생되지 않는다. */ 
		
		//instanceof 연산자는 객체가 instanceof 뒤에 지정한 클래스 타입으로 안전하게 형변환이 가능한지 검사한다.
		if (sub instanceof Base) {
			System.out.println("Sub 클래스 타입의 객체는 Base 클래스 타입으로 형변환 가능");
			Base base2 = sub;
			base2.say();
		} else {
			System.out.println("Sub 클래스 타입의 객체는 Base 클래스 타입으로 형변환 불가능");
		}
		
		if(base instanceof Sub) {
			System.out.println("Base 클래스 타입의 객체는 Sub 클래스 타입으로 형변환 가능");
		} else {
			System.out.println("Base 클래스 타입의 객체는 Sub 클래스 타입으로 형변환 불가능");
		}
		
		try {
			Sub sub2 = (Sub) base;
			sub2.say();
		} catch (ClassCastException e){
			System.out.println("Base 클래스 타입의 객체는 Sub 클래스 타입으로 형변환 불가능");
		}
		System.out.println("======================");
		
		//정상적인 downcasting
		Base base2 = sub;
		//downcasting은 부모 클래스 타입으로 upcasting된 것을 다시 자식 클래스 타입에 넣어주는 것을 말한다.
		if(base2 instanceof Sub) {
			Sub sub2 = (Sub) base2;
			sub2.say();
		} else {
			System.out.println("downcasting 불가능");
		}
		
	}
}














