

package k20230407;

import java.util.Scanner;

public class PerfectNum {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("완전수인가 판단할 숫자를 입력하세요: ");
		long number = scanner.nextInt();
		
//		약수 출력
//		for (int i = 1 ; i<=number ; i++) {		
//			if (number % i == 0) {
//				System.out.println(i);
//			}
//		}
//		
//		모든 숫자는 자기 자신을 제외하고 나눠서 떨어뜨릴 수 있는 큰 수는 자신의 절반을 넘지 않는다.
		long sum = 0; // 자기 자신을 제외한 약수의 합계를 기억할 변수
		for(long i = 1 ; i<=number/2; i++) {
			
//		입력한 숫자의 약수를 판단하다.
	 		 if(number % i == 0) {
	 			 sum += i;
	 		 }
		}	 
//	 	완전수인가 판단한다.
	 	if (number == sum) {
	 		System.out.println(number + "는(은)완전수이다.");
	 	}
	 	else {
	 		System.out.println(number + "는(은)완전수가 아니다.");		 	
	 	}
	}
}
