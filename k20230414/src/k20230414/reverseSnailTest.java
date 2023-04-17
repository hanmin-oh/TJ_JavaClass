package k20230414;

import java.util.Scanner;

public class reverseSnailTest {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("행렬의 차수를 입력하세요: ");
		int row = scanner.nextInt();
		
		int[][] a = new int [row][row];
		int n = 1 ; int s = 1; int i = 2 ; int j = 2; int k = 0;
		a[i][j] = 1;
		//boolean flag = false;
		
		EXIT :  // 레이블(소문자 가능, 예약어 x)
		while (true) { 
			k++;
			for(int p = 1 ; p<=k ; p++) {
				if(++n >Math.pow(row, 2)) {
					//flag = true;
					break EXIT;
				}
				j += s;
				a[i][j] = n;
			}
			
			/*if(flag) {
				break;
			}*/
			
			for (int p = 1 ; p<=k; p++) {
				i += s;
				a[i][j] = ++n;
			}
			s *= -1;
		}
		
		for(i = 0 ; i<a.length; i++) {
			for(j = 0 ; j<a[i].length ; j++) {
				System.out.printf("%3d " ,a[i][j]);	
			}
			System.out.println();
		}
	}
}
