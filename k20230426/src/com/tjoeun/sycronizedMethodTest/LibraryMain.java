package com.tjoeun.sycronizedMethodTest;

public class LibraryMain {
	
	public static Library library = new Library(); //main이 시작되기 전 생성되어 메모리 상단에 위치
	
	public static void main(String[] args) {
		/* Library library = new Library();
		 System.out.println(library.bookList);
		 ArrayList의 remove(Object) 메소드를 실행하면 삭제할 객체가 있으면 true, 없으면 false를 리턴하고
		 remove(index) 메소드를 실행하면 삭제하려는 index의 데이터가 리턴하고 삭제한다.
		 String book = library.bookList.remove(0);
		 System.out.println(book);
		 System.out.println(library.bookList);  */ 
		
		Student student1 = new Student("이순신");
		Student student2 = new Student("을지문덕");
		Student student3 = new Student("강감찬");
		Student student4 = new Student("홍범도");
		Student student5 = new Student("신돌석");
		Student student6 = new Student("곽재우");
		
		student1.start();
		student2.start();
		student3.start();
		student4.start();
		student5.start();
		student6.start();
		
	}
}
