package k20230413;

import java.util.Scanner;

public class SaupjaTest {
	
	public static void main(String[] args) {
		// 2208162517
		Scanner scanner = new Scanner(System.in);
		System.out.println("사업자 번호를 입력하세요");
		String saupja = scanner.nextLine().trim();
		
		//사업자등록번호의 9번째 자리까지 각 자리의 숫자와 가중치를 곱한 결과의 1자리 합계를 계산한다.
		String check = "137137135";
		int sum = 0;
		for(int i = 0 ; i<9; i++) {
			sum += Integer.parseInt(saupja.charAt(i) + "") * Integer.parseInt(check.charAt(i)+ "") %10 ;
		}
		
		//사업자 등록번호의 9번재 자리에 가중치를 곱한 결과의 10의 자리를 더한다.
		sum += Integer.parseInt(saupja.charAt(8) + "") * Integer.parseInt(check.charAt(8)+ "") /10 ;
		System.out.println(sum);
		
		//사업자등록번호의 가중치와 9번째 자리까지 연산 결과에 사업자등록번호의 10번째 자리의 숫자를 더한다
		sum += saupja.charAt(9) - 48 ;
		System.out.println(sum % 10 == 0 ? "정상" : "오류");
		
	}
	
}
