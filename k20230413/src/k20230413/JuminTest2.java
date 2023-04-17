package k20230413;

import java.util.Scanner;

public class JuminTest2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("주민번호를 13자리를 '-'없이 입력하세요");
		String jumin = scanner.nextLine().trim();
		
		//주민등록번호와 각 자리 숫자에 가중치를 곱한 합계를 계산한다.
		String check = "234567892345";
		int sum = 0;
		for(int i = 0 ; i<12; i++) {
			sum += Integer.parseInt(jumin.charAt(i) + "") * (i % 8 + 2);
		}
		System.out.println(sum);
		
		/*주민등록번호의 각 자리 숫자와 가중치를 곱한 합계를 11로 나눈 나머지를 11에서 뺀다 
		뺀 결과가 10 이상이면 10의 자리는 버리고 1의 자리만 취한다.*/
		int result = 0;
		result = (11 - sum % 11) % 10 ;
		System.out.println(result == jumin.charAt(12) - 48 ? "정상" : "오류");
		
	}
}
