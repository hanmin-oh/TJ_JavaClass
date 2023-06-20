package com.tjoeun.inheritance;

/*
-지식(하위, 서브, 파생) 클래스
-Child 클래스는 Parent 클래스를 상속받아 만든다.
-상속이란 부모 클래스에서 정의한 모든 필드와 메소드를 자식 클래스가 물려받는 것을 말한다.
-자식 클래스에서 별도의 선언 없이 부모 클래스의 모든 기능을 사용할 수 있다.
-public class 자식클래스 이름 extends 부모클래스이름 
*/
public class Child extends Parent{
	
	/*
    -Child 클래스는 Parent 클래스의 모든 필드와 메소드를 사용할 수 있다.
	-Child 클래스에서 필요한 기능을 정의한다. 부모 클래스의 필드를 사용할 수 있다.
	*/
	private int age;
	private String nickname; 
	
//	public Child() {
////		super();
//		/*
//		-super(); //부모 클래스의 기본 생성자
//		-this(); 는 현재 클래스를 의미하고 ()는 현재 클래스의 생성자를 의미한다.
//		-부모 클래스의 생성자가 자식 클래스의 생성자보다 먼저 실행
//		-부모 클래스에서 기본 생성자를 정의하지 않으면 super()실행할 때 에러
//		*/
//		System.out.println("자식 클래스의 생성자 실행");
//	}
////	
	/* 이클립스가 지원하는 생성자 자동 완성 기능을 사용할 때 현재 클래스에 물리적으로
	정의되지 않은 필드(상속받은 필드)는 생성자를 만드는 대화상자에 표시x   */
	
	/*
	부모 클래스에서 상속받은 필드의 접근 권한이 private 권한일 경우 자식 클래스에서 직접
	접근할 수 없기 대문에 부모 클래스의 생성자를 호출해서 초기화시킨다. */
//	public Child(String name, boolean gender, int age, String nickname) {
//		super(name, gender); //parent(String name , boolean gender)가 실현된다.
////		this.name = name; //에러, 부모 클래스에서 private 권한으로 설정된 필드는 접근할 수 없다..
////		this.gender = gender;
//		this.age = age;
//		this.nickname = nickname;
//	}
	//부모클래스의 생성자 실행 출력 X
	

	/*
	부모 클래스에서 private 권한으로 설정된 모든 필드에 setter 메소드가 
	정의되어있다면 setter은 메소드이므로 public 권한으로 작성되었기 때문에
	자식클래스에서 실행할 수 있으므로 부모 클래스에서 상속받은 private 권한의 
	필드를 setter을 이용해서 초기화할 수 있다.  	*/
	
//	 public Child(String name, boolean gender, int age, String nickname) {
//	  super(); setName(name); setGender(gender); 
//	  this.age = age; 
//	  this.nickname = nickname; 
//	 }
	 
	//부모클래스의 생성자 실행 출력 setter를 사용했기 때문

	
	/*
	-protected이용
	public Child(String name, boolean gender, int age, String nickname) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.nickname = nickname;
	} */
	public Child(String name, boolean gender, int age, String nickname) {
		super(name, gender);
		this.age = age;
		this.nickname = nickname;
	}
	
	@Override
	public String toString() {
		/* 
		- 부모 클래스에서 상속받은 private 권한을 가지는 필드는 자식 클래스에서 
		접근할 수 없으므로 부모 클래스에서 상속받은 private 권한을 가지는 필드에
		저장된 데이터는 getter 메소드를 사용해서 접근해야 한다.
		- 리턴 타입이 boolean인 메소드는 "is"로 메소드 이름을 시작하는게 관행이다. */
		return getName() + "(" + (isGender() ? "남" : "여") + ") - " + age + "," + nickname;
		
		/*
		- 자식 클래스에서 부모 클래스에서 상속 받은 메소드의 앞, 뒤에 기능을 추가할 수 
		있다.
		- 부모 클래스의 메소드를 실행하려면 부모 클래스를 의미하는 super 뒤에 "."을 찍고
		실행할 메소드 이름을 쓰면 된다.
		- super.toString():부모 클래스의 toString() 메소드를 실행한다.
		- return super.toString() + " - " + age + "," + nickname; 
		*/
		
		/*부모 클래스에서 상속받은 필드의 접근 권한이 protected일 경우 자식 클래스에서 접근할 수 있으므로 getter를 사용하지 않아도
		 필드의 내용을 얻어올 수 있다.
		return name + "(" + gender ? "남" : "여") + ") - " +age + "," + nickname;  
		*/
	}
}	
