package com.tjoeun.memoList;

import java.util.Scanner;

public class MemoMain {
	
	/*글 목록을 저장하는 MemoList 클래스 객체는 MemoMain클래스의 여러 메소드에서 사용해야 하기 
	때문에 memoMain클래스의 필드로 선언해야 한다.*/
	private static MemoList memoList = new MemoList();
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int menu = 0;
		
		while(menu != 7) {
			while(true) {
				System.out.println("====================================================================");
				System.out.println("1.입력 2.목록보기 3.수정 4.삭제 5.파일로 저장 6.파일에서 읽기 7.종료");
				System.out.println("====================================================================");
				menu = scanner.nextInt();
				if(menu >=1 && menu<= 7) {
					break;
				}
				System.out.println("메뉴는 1~7사이로 입력");
			}
			switch (menu) {
				case 1:
					insert(); break;
				case 2:
					System.out.println(memoList); break;
				case 3:
					update(); break;    
				case 4:
					delete(); break;
				case 5:
					filewrite(); break;
				case 6:
					fileread(); break;
			}
		}
		System.out.println("종료");
	}

	private static void insert() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("게시판에 저장할 글 입력");
		System.out.print("이름 :");
		String name = scanner.nextLine().trim();
		System.out.print("비밀번호 :");
		String password = scanner.nextLine().trim();
		System.out.print("메모 :");
		String memo = scanner.nextLine().trim();
		MemoVO vo = new MemoVO(name, password , memo);
		memoList.addMemo(vo);
		System.out.println("입력하신 정보가 저장되었습니다.");
	}
	
	private static void update() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("수정할 글번호를 입력하세요");
		int idx = scanner.nextInt();
		
		MemoVO original = memoList.selectMemo(idx);
		if(original == null) {
			System.out.printf("%d번 글이 존재하지 않습니다.\n", idx);
		} else {
			System.out.println(original);
			System.out.println("수정할 글의 비밀번호를 입력하세요 :");
			scanner.nextLine(); 
			String pw = scanner.nextLine().trim();
			if(pw.equals(original.getPassword())) {
				System.out.println("수정할 메모를 입력하세요");
				String memo = scanner.nextLine().trim(); 
				memoList.uqdateMemo(idx , memo); 
				System.out.println(idx + "번 글을 수정하였습니다.");
			} else {
				System.out.println("비밀번호를 다시 입력하세요.");
			}
		}
	}

	private static void delete() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("삭제할 글번호를 입력하세요");
		int idx = scanner.nextInt();
		
		MemoVO original = memoList.selectMemo(idx);
		
		if(original == null) {
			System.out.printf("%d번 글이 존재하지 않습니다.\n", idx);
		} else {
			System.out.println(original);
			System.out.println("삭제할 글의 비밀번호를 입력하세요 :");
			scanner.nextLine();
			String pw = scanner.nextLine().trim();
			if(pw.equals(original.getPassword())) {
				memoList.deletMemo(idx); 
				System.out.println(idx + "번 글을 삭제하였습니다.");
			} else {
				System.out.println("비밀번호를 다시 입력하세요.");
			}
		}
	}
	
	/*키보드로 텍스트 파일의 이름을 입력받아 MemoList 클래스의 memoList ArrayList에 저장된 데이터를
	텍스트 파일로 저장하는 메소드를 실행하는 메소드*/
	private static void filewrite() {
		Scanner scanner = new Scanner(System.in);
		//텍스트 파일의 이름을 입력받는다.
		System.out.println("저장할 텍스트 파일 이름을 입력하세요.");
		String filename = scanner.nextLine().trim();
		
		//memoList 클래스의 memoList ArrayLisst에 저장된 데이터를 텍스트 파일로 저장하는 메소드를 실행
		memoList.writeMemo(filename);
	}
	
	/*키보드로 텍스트 파일 이름을 입력받아 텍스트 파일의 데이터를 읽어서  MemoList클래스의 memoList 
	ArrayList에 저장하는 메소드를 실행하는 메소드*/
	private static void fileread() {
		Scanner scanner = new Scanner(System.in);
		//텍스트 파일의 이름을 입력받는다.
		System.out.println("읽어올 텍스트 파일 이름을 입력하세요.");
		String filename = scanner.nextLine().trim();
		
		//텍스트 파일의 데이터를 읽어 memoList 클래스의 memoList ArrayLisst에 저장하는 메소드를 실행
		memoList.readMemo(filename);
	}
	
}
