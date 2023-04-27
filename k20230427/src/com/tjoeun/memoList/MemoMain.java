package com.tjoeun.memoList;

import java.util.Scanner;

public class MemoMain {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int menu = 0;
		
		while(menu != 5) {
			while(true) {
				System.out.println("=============================================");
				System.out.println("1.입력 2.목록보기 3.수정 4.삭제 5.종료");
				System.out.println("=============================================");
				menu = scanner.nextInt();
				if(menu >=1 && menu<= 5) {
					break;
				}
				System.out.println("메뉴는 1~5사이로 입력");
			}
			switch (menu) {
				case 1:
					//MemoService 클래스의 테이블에 저장할 데이터를 입력받아 DAO 클래스로 넘겨주는 메소드 
					MemoService.insert(); //.을 찍으면 정적 메서드
					break;
				case 2:
					// MemoService 클래스의 테이블에 저장된 글 목록을 최신글 부터 얻어오는 메소드 
					MemoService.select();
					break;
				case 3:
					MemoService.update();
					break;    
				case 4:
					// MemoService 클래스의 삭제할 글번호를 입력받아 테이블에서 글을 삭제하는 메소드 
					MemoService.delete();
					break;
			}
		}
		System.out.println("종료");
	}
}
