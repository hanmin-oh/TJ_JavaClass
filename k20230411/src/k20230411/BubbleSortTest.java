package k20230411;

import java.util.Arrays;

public class BubbleSortTest {
	
	public static void main(String[] args) {
		
		int[] bub = {9, 1, 3, 4, 8};
		for(int i = 0 ; i < 4 ; i++) {
			for(int j = 0; j < 4-i; j++) {
				//비교 위치 설정 sysout("i = %d , j = %d\n , i , j );
				if(bub[j] > bub[j+1]) {
					int temp = bub[j];
					bub[j] = bub[j+1];
					bub[j+1] = temp;
				}
			}
			System.out.println(i + 1 + "회전결과: " + Arrays.toString(bub));
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		System.out.printf("버블정렬 결과 : %s" , Arrays.toString(bub));
	}
}