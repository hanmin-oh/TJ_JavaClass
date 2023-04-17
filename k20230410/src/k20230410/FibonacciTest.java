package k20230410;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciTest {

	public static void main(String[] args) {
		
		int a=1, b=1, y=2;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("피보나치 수열의 합을 계산할 항수 : ");
		int n = scanner.nextInt();
		for(int k=3 ; k<=n ; k++) {
			int c = a + b;
			y += c;
			a = b;
			b = c;
		}
		System.out.println("피보나치 수열의 "+ n + "번째 항 까지의 합: " +y);
	}
}
