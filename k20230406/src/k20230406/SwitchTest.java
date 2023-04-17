package k20230406;

import java.util.Scanner;

public class SwitchTest 
{

	public static void main(String[] args) 
	{

		Scanner scanner = new Scanner(System.in);
		System.out.print("3과목 점수를 입력하세요: ");
		int kor = scanner.nextInt();
		int math = scanner.nextInt();
		int eng = scanner.nextInt();

		int total = kor + math + eng;
		double average = (double) total / 3;

//		key에는 정수를 기억하는 변수 도는 연산 결과가 정수인 수식을 사용한다.
//		JDK 1.7 부터는 key에 문자열도 사용할 수 있다. - 실수는 사용할 수 없다(double, float)
//		switch (key) {
//			case value: //
//			key와 value가 일치하면 실행할 문
//			.......
//			[break;] ....필요에 따라 생략 가능
//		....
//		]default: ......... 기타 등등 케이스
//		key와 일치하는 value가 없을 경우 실행한 문장
//		}
//		switch ((int) average / 10) 
//		{
//		case 10:
//			System.out.println("A");
//			break;
//		case 9:
//			System.out.println("A");
//			break;
//		case 8:
//			System.out.println("B");
//			break;
//		case 7:
//			System.out.println("C");
//			break;
//		case 6:
//			System.out.println("D");
//			break;
//		default:
//			System.out.println("F");
//		}
		switch ((int) average / 10) 
		{
		case 10:
			System.out.println("참 잘했어요");
//			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
	}
}
