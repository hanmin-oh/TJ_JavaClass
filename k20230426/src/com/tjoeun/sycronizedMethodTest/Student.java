package com.tjoeun.sycronizedMethodTest;

public class Student extends Thread {
	
	//생성자를 통해서 스레드 이름(도서를 대여할 학생 이름)
	
//	public Student() { }
	public Student(String name) {
		super(name); //main에서 Student클래스의 객체를 만들어 메소드 실행했기 때문에 super(name)로 인한 스레드 실행
	}
	
	@Override
	public void run() {
		try {
			String book = LibraryMain.library.lendBook(); //도서 대여
			if(book == null) {
				return; //메소드 끝냄 -- thread 끝냄
			}
			sleep(2500); //대여 기간
			LibraryMain.library.returnBook(book); //도서 반납
		} catch (InterruptedException e) {
		}
	}
}
