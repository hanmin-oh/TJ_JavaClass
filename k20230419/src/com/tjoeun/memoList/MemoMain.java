package com.tjoeun.memoList;

import java.util.Scanner;

public class MemoMain {

	public static void main(String[] args) {
		
//		MemoVO memo1 = new MemoVO("mike" , "1111", "1등입니다.");
//		System.out.println(memo1);
//		MemoVO memo2 = new MemoVO("paul" , "2222", "2등입니다.");
//		System.out.println(memo2);
//		MemoVO memo3 = new MemoVO("jonh" , "3333", "3등입니다.");
//		System.out.println(memo3);
		
		//1.입력 2.목록보기 3.수정 4.삭제 5.종료
		Scanner scanner = new Scanner(System.in);
		int menu = 0;
		
		while(menu != 5) {
			while(true) {
				System.out.println("==========================");
				System.out.println("1.입력 2.목록보기 3.수정 4.삭제 5.종료");
				System.out.println("==========================");
				menu = scanner.nextInt();
				if(menu >=1 && menu<= 5) {
					break;
				}
				System.out.println("메뉴는 1~5사이로 입력");
			}
			//여기까지 왔다면 menu에는 1~5사이의 정수가 입력되었다는 의미이다.
			switch (menu) {
				case 1:
					insert();break;
				case 2:
					break;
				case 3:
					break;    
				case 4:
					break;
			}
		}
		System.out.println("종료");
	}
	
	//키보드로 이름,비밀번호,메모를 입력받아 클래스에 저장하고 ArrayList에저장하는 메소드를 만든다.
	private static void insert() {
		System.out.println("이름, 비밀번호, 메모를 입력해주세요 ");
		Scanner scanner = new Scanner(System.in);
		MemoVO user1 = new MemoVO(scanner.nextLine() , scanner.nextLine() , scanner.nextLine());
		MemoList memoList = new MemoList();
		memoList.addMemo(user1);
	}
}
