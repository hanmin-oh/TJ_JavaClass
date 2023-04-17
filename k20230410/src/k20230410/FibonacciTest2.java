package k20230410;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciTest2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("피보나치 수열의 합을 계산할 항수 : ");
		int n = scanner.nextInt();
		int[] fibo = new int [n];
		
		//배열의 0번재, 1번재 인덱스 요소를 각각 1로 초기화시킨다.
		fibo[0] = 1; 
		fibo[1] = 1; 
		int y = 2;
		for(int k = 3 ; k<=n ; k++) {
			fibo[k-1] = fibo[k-3] + fibo[k-2];
			y += fibo[k-1];
		}
		System.out.println(Arrays.toString(fibo));
		System.out.println("피보나치 수열의 "+ n + "번째 항까지의 합 : " +y);
		System.out.printf("피보나치 수열의 %d번째 항까지의 합 : %d%n = " , n ,y);
		for (int i = 0 ; i < fibo.length ; i++) {
			if(i > 0) {
				System.out.print(" + ");
			}
			System.out.print(fibo[i]);
		}
		//System.out.println(fibo[fibo.length - 1]);
	}
}