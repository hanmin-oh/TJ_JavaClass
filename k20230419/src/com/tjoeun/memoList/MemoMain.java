package com.tjoeun.memoList;

import java.util.Scanner;

public class MemoMain {
	
	/*글 목록을 저장하는 MemoList 클래스 객체는 MemoMain클래스의 여러 메소드에서 사용해야 하기 
	때문에 memoMain클래스의 필드로 선언해야 한다.*/
	private static MemoList memoList = new MemoList();
	
	public static void main(String[] args) {
		
		//	MemoVO memo1 = new MemoVO("mike" , "1111", "1등입니다.");
		//	System.out.println(memo1);
		//	MemoVO memo2 = new MemoVO("paul" , "2222", "2등입니다.");
		//	System.out.println(memo2);
		//	MemoVO memo3 = new MemoVO("jonh" , "3333", "3등입니다.");
		//	System.out.println(memo3);
		
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
					insert(); break;
				case 2:
					System.out.println(memoList); break;
				case 3:
					update(); break;    
				case 4:
					delete(); break;
			}
		}
		System.out.println("종료");
	}
	
	//키보드로 이름,비밀번호,메모를 입력받아 클래스에 저장하고 ArrayList에저장하는 메소드를 만든다.
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
	
	/*키보드로 수정할 글 번호를 입력받아 수정할 글 1건을 얻어와 화면에 표시하고 비밀번호와 수정할
	내용을 입력받아 memoList라는 ArrayList에 저장된 글 한건을 삭제한다.*/
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
			scanner.nextLine(); //키보드 버퍼
			String pw = scanner.nextLine().trim();
			if(pw.equals(original.getPassword())) {
				System.out.println("수정할 메모를 입력하세요");
				String memo = scanner.nextLine().trim(); //수정할 메모 입력
				memoList.uqdateMemo(idx , memo); 
				
				System.out.println(idx + "번 글을 수정하였습니다.");
			} else {
				System.out.println("비밀번호를 다시 입력하세요.");
			}
		}
	}

	/*키보드로 삭제할 글 번호를 입력받아 삭제할 글 1건을 얻어와 화면에 표시하고 비밀번호를 입력받아 
	memoList라는 ArrayList에 저장된 글 한건을 삭제한다.*/
	private static void delete() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("삭제할 글번호를 입력하세요");
		int idx = scanner.nextInt();
		
		//memoList라는 ArrayList에 지정된 글 1건을 얻어오는 메소드를 실행하고 얻어온 결과를 MemoVO 클래스 객체에 저장
		MemoVO original = memoList.selectMemo(idx);
		
		//삭제할 글번호에 해당되는 글이 존재하면 글을 삭제하고 존재하지 않으면 존재하지 않는다는 메시지 출력
		if(original == null) {
			System.out.printf("%d번 글이 존재하지 않습니다.\n", idx);
		} else {
			System.out.println(original);
			System.out.println("삭제할 글의 비밀번호를 입력하세요 :");
			//삭제할 글의 비밀번호를 입력
			scanner.nextLine();
			String pw = scanner.nextLine().trim();
			//삭제하기 위해 입력한 비밀번호와 삭제할 글의 비밀번호를 비교한다.
			if(pw.equals(original.getPassword())) {
				memoList.deletMemo(idx); 
				//original == null;
				System.out.println(idx + "번 글을 삭제하였습니다.");
			} else {
				System.out.println("비밀번호를 다시 입력하세요.");
			}
		}
	}
}
