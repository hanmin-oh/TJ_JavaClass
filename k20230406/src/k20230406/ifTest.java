package k20230406;

import java.util.Scanner;

public class ifTest 
{

	public static void main(String[] args) 
	{ 
//		관계(비교) 연산자 : 연산 결과는 무조건 참(true) 또는 거짓(false)이다.
//		>(크다, 초과) >=(크거나 같다) <(작다, 미만), <=(작거나 같다, 이하)
//		==(같다) !=(같지 않다)
		
//		논리 연산자 : 연산 결과는 무조건 참(true) 또는 거짓(false)이다.
//		&&(논리곱(and), 두 조건이 모두 참, -이고 , 이면서, -중에서) ||(논리합(or), 두 조건 중 하나 이상 참, -나, -또는) !(논리부정(not))
		
//		연산자 우선순위
//		단항 연산자 => 이항연산자(산술, 관계, 논리) => 삼항연산자(?:) => 대입연산자('='와 함께 사용)
//		() => ! => 산술연산자(+, /, % => + - => >, >=, <= => 관계연산자(==,!=) => 논리연산자(&& => ||)
//		if (조건식) {
//		      조건식이 참일 경우 실행할 문장;
//		} else {
//		
//		}
//		조건식이 거짓일 경우 실행할 내용이 없다면 else 이하를 생략하면 된다.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("나이를 입력하세요: ");
		int age = scanner.nextInt();
		
		if (age >= 18) {
			System.out.println("투표권이 있습니다.");
		}
		else {
			System.out.println("투표권이 없습니다. ");
		}
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.println();
				
	}

}
