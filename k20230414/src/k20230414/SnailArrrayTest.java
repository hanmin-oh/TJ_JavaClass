package k20230414;

import java.util.Arrays;
import java.util.Scanner;

public class SnailArrrayTest {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("행렬의 차수를 입력하세요: ");
		int row = scanner.nextInt();
		
		int[][] a = new int [row][row];
		int n = 0 ; int s = 1; int i = 0; int j = -1; int k = row;
		
		while (true) { 
			
			for(int p = 1 ; p<=k ; p++) {
				j += s;
				a[i][j] = ++n;
			}
			if(--k == 0)
			break;
			
			for (int p = 1 ; p<=k; p++) {
				i += s;
				a[i][j] = ++n;
			}
			s *= -1;
		}
		/*for(k = row ; k>=0 ; k--) {
			a[i][j] = ++n;
			j = j+s;
		}	
		for(j = 0 ; j<a[i].length ; j++ ) {
			a[i][j] = ++n;
			
		}
		s *= -1;*/
		
		for(i = 0 ; i<a.length; i++) {
			for(j = 0 ; j<a[i].length ; j++) {
				System.out.printf("%3d " ,a[i][j]);	
			}
			System.out.println();
		}
	}
}
