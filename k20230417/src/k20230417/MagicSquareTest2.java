package k20230417;

import java.util.Scanner;

public class MagicSquareTest2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n;
		while(true) {
			System.out.print("3이상의 홀수로 행렬의 차수를 결정해주세요: ");
			n = scanner.nextInt();
			if( n >= 3 && n % 2 == 1) {
				break;
			} 
			System.out.println("3이상인 홀수를 입력하세요");
		}
		
		
		int[][] a = new int [n][n] ;
		int i = 0, j = (n-1)/2;
		for(int k = 1 ; k <= Math.pow(n, 2) ; k++) {
			a[i][j] = k;
			if(k % n == 0) {
				i++;
			}else {
				if(--i < 0) {
					i = n-1;
				}
				if(++j == n) {
					j = 0;
				}
			}
		}
		for( i = 0 ; i<a.length; i++) {
			for( j = 0 ; j<a[i].length ; j++) {
				System.out.printf("%4d " ,a[i][j]);	
			}
			System.out.println();
		}
	}
}
