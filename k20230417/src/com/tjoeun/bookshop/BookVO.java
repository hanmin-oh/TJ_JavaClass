package com.tjoeun.bookshop;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 	VO(Value Object) 클래스 : 1건의 데이터와 데이터를 처리하는 메소드를 모아놓은 클래스이다. 
 	VO 클래스는 DTO(Data Transfer Object)라고도 부른다. 
 	bean : 처리할 데이터를 기억하는 변수와 변수에 데이터를 입출력할 수 있는 getters & setters메소드로만
 	구성되는 클래스를 말한다.
*/

//도서정보 1건을 기억하는 클래스
public class BookVO {
	
	/*	데이터를 기억할 멤버 변수(필드)를 선언한다. => 클래스 내부에 선언되는 모든 메소드에서 사용할 수 있다.
		일반 변수를 선언하면 변수에는 어떤 값이 들어있는지 모르지만(쓰레기) 클래스에서 선언하는 필드는 별도로
		초기화하지 않아도 숫자는 0, 문자는 공배, boolean은 false, 클래스로 만든 객체(참조 변수)는 null로 자동 
		초기화 된다. 
	*/
	
	private String title = ""; //도서명
	private String author = ""; //저자
	private String publisher = ""; //출판사
	private Date writeDate = new Date(); //출판일
	private double price = 0; //가격
	//어짜피 필드는 직접 선언해야 하기 때문에 직접 선언할 때 초기화하는 것이 편하다.
	
	
	
	/*기본생성자
	-생성자 메소드(이하 생성자)를 선언한다.
	-생성자 이름은 반드시 클래스 이름과 같아야 한다.
	-생성자를 선언하지 않으면 컴파일러가 자동으로 아무런 일도 하지않는 생성자(기본 생성자)를 만들어 준다.
	-프로그래머가 생성자를 선언하면 기본 생성자를 자동으로 만들어 주지 않는다. 
	-생성자는 리턴타입을 사용하지 않고 생성자 내부에서 return도 사용하지 않는다.
	-생성자는 객체가 생성될 때 자동으로 실행되고 용도는 필드에 데이터 초기화를 목적으로 사용한다.
	public BookVO() {
		,,, 귀찮다!! -- Crtl + space 
	} */
	public BookVO() {
		/*
		System.out.println("기본 생성자가 실행됩니다."); //return안썼는데 자동 실행 ,,, 기본생성자가 첫줄이어야 하기 때문에 주석처리
		title = "";
		author = "";
		publisher = "";
		writeDate = new Date();
		price = 0.0;
		*/
		//this("제목초기화", "작자초기화", "출판사초기화", new Date(), 0); 
		/*this();만 쓰면 현재클래스의 기본 생성자 -- BookVO()가 이미 기본생성자이기 때문에 재귀호출(호출이 끝이 안난다.) 복귀주소가 스택에 쌓여 스택이 터진다.
		현재 클래스의 다른 생성자를 호출한다. ------- 필드에서 초기화하는 것이 편하다.
		*/
	}

	
	//데이터를 넘겨받아 필드를 초기화시키는 생성자
	public BookVO(String title, String author, String publisher, Date writeDate, double price) {
		super();
		/*
		부모 클래스를 말한다 -- 부모 클래스의 생성자 (this = 현재클래스) 
		(생략해도 컴파일러가 자동으로 붙여준다.)
		super(): 부모 클래스의 기본 생성자를 호출한다.
		this() : 현재클래스의 기본 생성자.
		super()와 this()는 반드시 생성자의 첫 문장으로 적어야 한다.
		*/
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		//this.writeDate = writeDate;
		//인수로 넘어온 writeDate에 저장된 날짜 데이터에서 년은 1900을 월은 1을 빼서 다시 저장.
		writeDate.setYear(writeDate.getYear() - 1900);
		writeDate.setMonth(writeDate.getMonth() - 1);
		this.writeDate = writeDate;
 		this.price = price;
	}
	
	/*getters & setters 메소드를 선언한다.
	gettres & setters 메소드는 private 권한으로 선언한 필드를 클래스 외부에서 접근할 수 있도록 예외 규정을 만든다. 
	public String getTitle (){
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}*/
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getPublisher() {
		return publisher;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	public Date getWriteDate() {
		return writeDate;
	}


	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
	/*
	클래스 객체에 저장된 데이터를 보고싶다면 toString() 메소드를 Override(재정의) 해야한다.
	@Override  : 어노테이션은 이 메소드가 부모 클래스에서 상속받은 메소드를 @Override한 메소드임을 의미한다.
	@Override 어노테이션이 붙어있는 메소드는 메소드 이름을 수정해서 상속받은 메소드 이름과 다르게하면 에러를 발생시킨다.  
	*/
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E)");
		/*숫자 데이터 출력 서식 만들기
		NumberFormat 클래스로 숫자 출력 서식 지정하기 => 미리 제작되서 제공되는 서식만 사용할 수 있다.
		
		-NumberFormat nf = NumberFormat.getNumberInstance(); // 천 단위 구분 기호
		-NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.KOREA); // 통화 표시와 천 단위 구분 기호
		-NumberFormat nf = NumberFormat.getPercentInstance(); //백분율, 자동으로 100이 곱해진다.
		
		-DecimalFormat 클래스로 출력 서식 지정하기 => 만들어 사용한다.
		-DecimalFormat df = new DecimalFormat("출력 서식");
		-출력 서식에는 "#,##0"을 입력하고 앞, 뒤로 서식에 필요한 문자를 직접 입력해서 만든다.
		-소수점 아래 숫자를 출력하려면 "."을 입력하고 보고싶은 자리만큼 "0"을 입력한다.*/
		DecimalFormat df = new DecimalFormat("#,##0원");
		
		return "BookVO [title=" + title + ", author=" + author + ", publisher=" + publisher + ", writeDate=" + sdf.format(writeDate)
			+ ", price=" + df.format(price) + "]";
	}
}
