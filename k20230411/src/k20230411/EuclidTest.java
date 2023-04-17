package k20230411;

import java.util.Scanner;

public class EuclidTest {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int a, b;
		System.out.print("a: ");
		a = scanner.nextInt();
		System.out.print("b: ");
		b = scanner.nextInt();
		int big, small;
		if(a > b) {
			big = a; small = b;
		} else {
			big = b; small = a;
		}
		System.out.printf("큰수 :%d , 작은수 : %d\n", big, small);
		while(true) {
			int r = big%small;
			if( r == 0 ) {
				break;
			}
			 /*큰 수를 작은 수로 나눠 떨어지지 않았으면 큰 수를 기억하던 기억장소에는 작은 수를 넣어주고 
			 작은 수를 기억하던 기억장소에는 나머지를 넣어준다.*/
			big = small;
			small = r;
		}
		System.out.printf(" %d와 %d의 최대공약수 : %d\n ", a , b , small);
		System.out.printf("%d와 %d의 최소공배수 : %d\n ", a , b , (a*b)/small);
	}
}