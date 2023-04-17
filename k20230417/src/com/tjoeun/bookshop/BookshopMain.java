package com.tjoeun.bookshop;

import java.util.Date;

public class BookshopMain {
	
	public static void main(String[] args) {
		
		//클래스이름 객체(변수)이름 = new 생성자();
		BookVO vo = new BookVO(); //BookVO : 생성자
		System.out.println(vo);
		//System.out.println(vo.title); private권한으로 선언된 변수에 접근하면 에러가 발생된다.
		//클래스로 만든 객체를 출력하면 자동으로 toString()메소드가 실행된다.
		System.out.println(vo.toString());
		
		//도서 정보를 만든다.
		BookVO book1 = new BookVO("java", "홍길동", "더좋은출판사", new Date(2020, 5, 13), 33000);
		System.out.println(book1);
		//private 권한으로 선언된 필드에 접근하기 위해서 getters & setters 메소드를 만들어 사용한다.
		System.out.println(book1.getTitle());
		book1.setTitle("spring");
		System.out.println(book1);
	}

}
