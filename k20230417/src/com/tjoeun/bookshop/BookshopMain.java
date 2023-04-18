package com.tjoeun.bookshop;

import java.util.Date;

public class BookshopMain {
	
	public static void main(String[] args) {
		
		/*
		클래스이름 객체(변수)이름 = new 생성자();  --- 생성자 생성했으니 주석처리 가능
		BookVO vo = new BookVO(); //BookVO : 생성자
		System.out.println(vo);
		System.out.println(vo.title); private권한으로 선언된 변수에 접근하면 에러가 발생된다.
		클래스로 만든 객체를 출력하면 자동으로 toString()메소드가 실행된다.
		System.out.println(vo.toString());  
		*/
		
		//도서 정보를 만든다.
		BookVO book1 = new BookVO("java", "홍길동", "더좋은출판사", new Date(2020, 5, 13), 33000);
		System.out.println("book1 : " + book1);
		/*private 권한으로 선언된 필드에 접근하기 위해서 getters & setters 메소드를 만들어 사용한다.
		System.out.println(book1.getTitle());
		book1.setTitle("spring");
		System.out.println(book1); */
		
		BookVO book2 = new BookVO("java", "오을지", "더좋은출판사", new Date(2020, 5, 13), 33000);
		BookVO book3 = new BookVO("java", "오문덕", "더좋은출판사", new Date(2020, 5, 13), 33000);
		BookVO book4 = new BookVO("java", "이순신", "더좋은출판사", new Date(2020, 5, 13), 33000);
		BookVO book5 = new BookVO("java", "이회영", "더좋은출판사", new Date(2020, 5, 13), 33000);
		BookVO book6 = new BookVO("java", "오을지", "더좋은출판사", new Date(2020, 5, 13), 33000);
		
		System.out.println("book2 : " + book2);
		System.out.println("book6 : " + book6);
		
		/*"=="를 사용해서 같은가 비교할 수 있는 데이터는 기본 자료형 8가지와 null만 가능하다.
		따라서 클래스로 만든 객체는 "=="로 비교하면 안된다. => 데이터가 아닌 데이터가 생성된
		주소를 비교하기 때문데 */
		if(book2 == book6) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다."); 
		}
		/* String은 단일데이터가 저장되는 클래스라서 equals() 메소드만 사용하면 저장된 내용이 같은가 다른가 
		비교할 수 있었지만 사용자 정의 클래스 객체는 단일 데이터가 아니기 때문에 별도의 설정을 하지 않으면
		equals() 메소드로 비교할 수 없다. */
		if(book2.getAuthor().equals(book6.getAuthor()) ){
			System.out.println("같다.");
		} else {
			System.out.println("다르다."); 
		}
		/*클래스 객체를 비교할 때 객체를 구성하는 모든 필드의 내용이 같은가 비교할 수 있도록 equals()메소드를
		Override 해야 하고 내용이 동일한 객체는 같은 hashCode를 가질 수 있도록 hashCode() 메소드도 Override를 
		해야한다.*/
		if(book2.equals(book6)) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다."); 
		}
		
		
		//여러권의 책 정보를 기억하는 클래스의 객체를 만든다.
		BookList bookList = new BookList(5);
		
		//도서 정보를 BookList 클래스의 booklist 배열에 저장하는 메소드 실행
		bookList.addBook(book1);
		bookList.addBook(book2);
		bookList.addBook(book3);
		bookList.addBook(book4);
		bookList.addBook(book5);
		bookList.addBook(book6);
		
		
		System.out.println(bookList);
		
		
		
		
		
		
	}
	
}
