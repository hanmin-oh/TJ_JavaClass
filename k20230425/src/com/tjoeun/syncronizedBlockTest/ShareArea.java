package com.tjoeun.syncronizedBlockTest;

// 입출금을 실행하는 스레드와 잔액을 출력하는 스레드가 공유해서 사용할 클래스
public class ShareArea {
	
	Account lee = new Account("111-11-1111" , "이순신" , 10000000);
	Account ulji = new Account("222-22-2222" , "을지문덕" , 10000000);
	
}
