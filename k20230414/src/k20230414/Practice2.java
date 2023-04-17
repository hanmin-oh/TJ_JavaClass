package k20230414;

import java.util.Arrays;
import java.util.Scanner;

public class Practice2 {
	//역달팽이
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("행렬의 차수를 입력하세요: ");
		int row = scanner.nextInt();
		
		int[][] a = new int [row][row];
		int n = 1 ; int s = 1; int i = 2; int j = 2; int k = 1;
		a[i][j] = 1;
		while (true) { 
			
			for(int p = 1 ; p<=k ; p++) {
				j += s;
				a[i][j] = ++n;
			}
			if(++k == 4)
			break;
			
			for (int p = 1 ; p<=k; p++) {
				i += s;
				a[i][j] = ++n;
			}
			s *= -1;
		}
		for( i = 0 ; i<a.length; i++) {
			for( j = 0 ; j<a[i].length ; j++) {
				System.out.printf("%2d " ,a[i][j]);	
			}
			System.out.println();
		}
		 /*for(int i = 0 ; i<6 ; i++) {
			for(int j = 0 ; j<a[i].length ; j++) {
					a[i][j] = j +1;
				}
				int j = 0;
				System.out.printf("%2d " ,a[i][j]);		
			} */
		
	}
}
