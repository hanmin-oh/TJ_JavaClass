package k20230417;

import java.util.Scanner;

public class MagicSquarePractice {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("행렬의 차수를 입력하세요: ");
		int row = scanner.nextInt();
		
		int[][] a = new int [row][row];
		int n = 1 ; int i = row-1 ; int j = row/2; 
		a[i][j] = n;
		for(n = 1 ; n<=Math.pow(row, 2) ; n++ ) {
			if( n % row != 0 ) {
				if (j == row-1) {
					if(i==0) {
						int temp = i;
						i = j;
						j = temp;
						a[i][j] = n;
					}
					else {
						i = i-1;
						j = j-row+1;
						a[i][j] = n;
					}
					
				}	
				else if (i == 0 ) {
					i = i+row-1;
					j = j+1;
					a[i][j] = n;
				}
				else {
					i = i-1;
					j = j+1;
					a[i][j] = n;
				}
				
			}
			else if(n % row == 0) {
				if(i == row-1) {
					i = i-row+1;
					a[i][j] = n;
				} else {
					i = i+1;
					a[i][j] = n;
				}
			}
		}
		for( i = 0 ; i<a.length; i++) {
			for( j = 0 ; j<a[i].length ; j++) {
				System.out.printf("%2d " ,a[i][j]);	
			}
			System.out.println();
		}
	
	}
}
