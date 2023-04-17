package k20230413;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class JuminTest {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("주민번호를 13자리를 '-'없이 입력하세요");
		String jumin = scanner.nextLine().trim();
		// 8304221185600
		System.out.println(jumin.charAt(6));
		System.out.println((int)jumin.charAt(6));
		
		/* 숫자와 문자는 표현하는 방법이 다르다.
		문자1(49)는 011001 숫자 1은 000001 --다른데이터로 취급
		--- 밑의 조건이 무조건 거짓 판정이 난다.*/
		
		if(jumin.charAt(6) % 2 == 1 ) {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
		System.out.println("-----------------------------");
		System.out.println(jumin.substring(0 , 2));
		System.out.println(jumin.charAt(0));
		System.out.println(jumin.charAt(1));
		int year = (jumin.charAt(0) - '0') * 10 +(jumin.charAt(1) - 48); //10의자리 1의자리 일일이 구함
		System.out.println(year);
		System.out.println("-----------------------------");
		/*Integer.parseInt() 인수로 저장된 문자열을 정수로 변환
		Double parseDouble() 인수로 지정된 문자열을 실수로 변환
		Boolean paresBoolean 인수로 지정된 문자열을 논리값으로 변환 */
		year = Integer.parseInt(jumin.substring(0,2));
		System.out.println(year);
		System.out.println(Integer.parseInt('1' + ""));
		
		 /*if(jumin.charAt(6) <= '2') {
			year += 1900;
		} else {
			year += 2000;
		}*/
		year += jumin.charAt(6) <= '2' ? 1900 : 2000;
		System.out.println(year);
		
		//컴퓨터의 날짜 데이터를 얻어와서 년도만 꺼낸다.
		Date date = new Date();
		System.out.println("나이: " + (date.getYear() + 1900 - year));
		Calendar calendar = Calendar.getInstance();
		System.out.println("나이: " + (calendar.get(Calendar.YEAR) - year));
	}

}
