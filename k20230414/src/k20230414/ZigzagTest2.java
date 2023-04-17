package k20230414;

import java.util.Arrays;

public class ZigzagTest2 {
	
	public static void main(String[] args) {
		
		int[][] a = new int[4][6];
		
		for(int i = 0 ; i<a.length ; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
		
		int n = 0;
		int start = 0; //2차원 배열에 숫자가 채워지기 시작하는 열의 인덱스 
		int end = a[0].length -1 ;
		int sw = 1; // start부터 end까지 증가치로 사용할 변수
		
		for(int i = 0 ; i<a.length ; i++) {
			/*숫자 채우기가 들어간다.
			i = 0 , j = 0, 1, 2, 3, 4, 5 
			i = 1 , j = 5, 4, 3, 2, 1, 0
			i = 2 , j = 0, 1, 2, 3, 4, 5 
			i = 3 , j = 5, 4, 3, 2, 1, 0
			 */
			for(int j = start ; j != end + sw  ; j += sw) {
				a[i][j] = ++n;
			}
			int temp = start;
			start = end;
			end = temp;
			sw *= -1;
		}
		
		for(int i = 0 ; i<a.length; i++) {
			for(int j = 0 ; j<a[i].length ; j++) {
				System.out.printf("%2d " ,a[i][j]);	
			}
			System.out.println();
		}
	}
}
