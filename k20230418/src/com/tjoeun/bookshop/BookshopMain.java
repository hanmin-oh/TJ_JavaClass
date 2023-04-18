package com.tjoeun.bookshop;

import java.util.Date;

public class BookshopMain {
	
	public static void main(String[] args) {
		BookVO book1 = new BookVO("java", "홍길동", "더좋은출판사", new Date(2020, 5, 13), 33000);
		System.out.println("book1 : " + book1);
		
		BookVO book2 = new BookVO("java", "오을지", "더좋은출판사", new Date(2020, 5, 13), 33000);
		BookVO book3 = new BookVO("java", "오문덕", "더좋은출판사", new Date(2020, 5, 13), 33000);
		BookVO book4 = new BookVO("java", "이순신", "더좋은출판사", new Date(2020, 5, 13), 33000);
		BookVO book5 = new BookVO("java", "이회영", "더좋은출판사", new Date(2020, 5, 13), 33000);
		BookVO book6 = new BookVO("java", "오을지", "더좋은출판사", new Date(2020, 5, 13), 33000);
		
		BookList bookList = new BookList(); // 생정자가 없으면 데이터를 새로 받을 수 없다. (int size를 가지는 배열 생성 못함)
		
		bookList.addBook(book1);
		bookList.addBook(book2);
		bookList.addBook(book3);
		bookList.addBook(book4);
		bookList.addBook(book5);
		bookList.addBook(book6);
		
		System.out.println(bookList);
		
	}
}
