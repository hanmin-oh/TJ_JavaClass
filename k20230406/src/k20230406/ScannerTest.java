package k20230406;

import java.util.Scanner;

public class ScannerTest 
{

	public static void main(String[] args) 
	{

// 		변수 : 프로그램에서 처리할 데이터(상수)를 기억하는 기억장소를 말한다.
// 		변수 이름은 영문자, 숫자, 특수문자(_)만 사용해서 만들 수 있고 첫 글자는 반드시 문자로 시작
// 		변수는 변수를 선언한 후 최초로 사용하기 전에 반드시 초기화시켜야 한다.
// 		자료형 변수이름; // 변수만 선언 => 변수에는 쓰레기가 들어있다.
// 		중괄호 안의 변수들은 지역변수
// 		= 의 의미는 = 오른쪽의 데이터를 = 왼쪽의 기억장소에 대입(할당, 배정) , '=='가 같다로 사용

		int num = 0;
		System.out.println(num);
// 		'클래스이름' '객체이름(클래스로 만든 변수)' = new 생성자(); - 생성자 이름은 클래스와 같다
		
		Scanner scanner = new Scanner(System.in); //키보드로 입력받는 스캐너
//		키보드로 입력받은 데이터를 변수에 저장한다. 
		
		System.out.print("주소: ");
		String addr = scanner.nextLine(); // next는 한 단어 입력
		System.out.print("이름 : ");
		String name = scanner.nextLine(); // nextLine은 한 줄 입력  ... 
//		키보드 버퍼가 비어있으면 입력을 기다리며 대기하지만 키보드 버퍼가 비어있지 않으면 키보드 버퍼의 내용을 끝까지 읽어들인다.
		
//		스캐너로 키보드를 입력하는 내용을 입력받을 경우 바로 변수에 저장되는 것이 아니고 키보드 버퍼라는 임시 기억장소
//		임시 기억장소에 저장된 후 읽어들이는 메소드가 실행될 때 변수에 저장한다. 서울시만 읽어서 addr에 넣는다.
		
		System.out.println(name + "님은 " + addr + "에 삽니다.");

						
	}

}


