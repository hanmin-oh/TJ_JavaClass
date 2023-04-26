package com.tjoeun.sycronizedMethodTest;

import java.util.ArrayList;

public class Library {
	
	ArrayList<String> bookList = new ArrayList<>();
	
	public Library() {
		bookList.add("오만과 편견");
		bookList.add("칼의 노래");
		bookList.add("토지");
// bookList.add("해리포터");
// bookList.add("남한산성");
// bookList.add("오발탄");
		
	}
	
	//도서 대여 메소드
	/* - 동기화 메소드는 synchronized 예약어 사용해서 선언
	 - 메소드가 실행되는 모든 내용이 종료될 때 까지 다른 스레드가 */
	public synchronized String lendBook() {
		
		Thread thread = Thread.currentThread();
		
		//대여할 책이 없으면 책이 반납될 때 가지 스레드를 일시적으로 멈춘다.
		if (bookList.size() == 0 ) {
			try {
      			System.out.println(thread.getName() + ": 대기 시작");
			 /* returnBook() 메소드에서 notify() 메소드를 실행해서 일시정지된 스레드를
			 깨울 때 까지 멈춘다.*/
				wait();
				System.out.println(thread.getName() + ": 대기 종료");
			} catch (InterruptedException e) {
			}
		}
		String book = bookList.remove(0);
		System.out.println(thread.getName() + " : '" + book + "' 대여");
		return book;
	}
	
	//도서 반납 메소드(반납이니 리턴값이 필요 없을 것이다.)
	public synchronized void returnBook (String book) {
		Thread thread = Thread.currentThread();
		bookList.add(book);
		//도서관에 책이 없어서 일시적으로 멈췄던 스레드를 깨운다.
		notify();
		System.out.println(thread.getName() + ": " + book + "반납");
	}
}
