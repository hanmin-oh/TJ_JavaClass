package k20230412;

import java.util.Scanner;

public class FactorizationInPrimeNumberTest {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("소인수 분해할 숫자를 입력하세요: ");
			int n = scanner.nextInt();
			if(n<2) {
				break;
			}
			 //소인수분해 시작
			int[] s = new int[20];
			int number = n;
			int c =0;
			
			while (true) {
				int k = 2;
				
				while (true) {
					int r = n % k;
					if( r == 0 ) {
						break;
					}
					k++;
				}
				 //소인수분해가 되었으면 s배열에 소인수를 넣어준다.
				s[c++] = k;
				 //다음 소인수을 얻기 위해 n에 n을 k로 나눈 몫을 넣어준다.
				n /= k;
				if(n == 1)
					break;
					 /*if(c == 1) {
						System.out.println(number + "는(은) 소수입니다.");
					 }*/ 
			}	
			 //n이 소수면 소수라고 출력하고 소수가 아니면 분해된 소인수를 출력한다.
			 //소인수의 개수(c)가 1개라면 자기 자신으로 나눠 떨어진 것을 의미하므로 소수
			if(c == 1) {
				System.out.println(number + "는(은) 소수입니다.");
			} else {
				System.out.print(number + " = ");
				for(int y=0 ; y<c-1 ; y++) {
					System.out.print(s[y] + " * ");
				}
				System.out.println(s[c - 1]);
			}
		}
		System.out.println("프로그램 종료");
	}
}
