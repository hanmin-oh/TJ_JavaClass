package k20230413;

import java.util.Arrays;

public class Practice {
	
	public static void main(String[] args) {
		
		int[] jumin = {9, 5, 0, 7, 0, 7, 1, 1, 2, 4, 5, 1, 1}; 
		int[] n = new int[11];
		for(int i = 0 ; i<11; i++) {
			if( i < 8 ) {
				n[i] = jumin[i] * (i+2) ;
			} else {
				n[i] = jumin[i] * (i-6);
			} 
		}
		System.out.println(Arrays.toString(n));
		int sum = 0;
		sum = n[0] + n[1] + n[2]+ n[3]+ n[4]+ n[5]+ n[6]+ n[7]+ 
				n[8]+ n[9]+ n[10];
		System.out.println(sum);
		int j = 0;
		j = (sum % 11) % 10;
		if( (11 - j) %10 == jumin[12] ) {
			System.out.println("주민번호가 정상입니다.");
		} else {
			System.out.println("잘못된 주민번호입니다.");
		}
	}

}
