package k20230411;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertTest3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("16진수로 변환할 10진수를 입력하세요 : ");
		int dec = scanner.nextInt();
		int number = dec;
		int[] bin = new int[8];
		int index = 0; 
		
		while (true) {
			
			int m = dec / 16; 
			int r = dec % 16; 
			bin[index++] = r;  
 			if(m == 0) {
				break;
			}
 			dec=m;
		}
			/*System.out.print(number + " 를(을) 8진수로 변환하면 ");
			for(int i=bin.length-1 ; i>=0 ; i--) {
				System.out.print(bin[i]);
			}
			System.out.println(" 입니다.");*/
		 // 16진수 각 자리 숫자를 기억하는 배열을 선언한다. 
		char[] h = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'}; 
		System.out.print(number + " 를(을) 16진수로 변환하면 ");
		for(int i=index-1 ; i>=0 ; i--) {
			System.out.print(h[bin[i]]);
		}
		System.out.println(" 입니다.");
	}
	
}
