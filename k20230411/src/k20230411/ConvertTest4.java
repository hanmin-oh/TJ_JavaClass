package k20230411;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertTest4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("n진수로 변환할 10진수를 차례로 입력하세요");
		int n = scanner.nextInt();
		int dec = scanner.nextInt();
		 //System.out.println(n + "진수로 변환할 10진수를 입력하세요 : " + dec);
		int number = dec;
		int[] bin = new int[8];
		int index = 0; 
		
		while (true) {
			
			int m = dec / n; 
			int r = dec % n; 
			bin[index++] = r;  
 			if(m == 0) {
				break;
			}
 			dec=m;  //index가 5이다.
		}
		  //System.out.println(index);
		System.out.print(number + " 를(을) "  + n + "진수로 변환하면 ");
		for(int i=bin.length-1 ; i>=0 ; i--) {
			System.out.print(bin[i]);
		}
		System.out.println(" 입니다.");
		 // 16진수 각 자리 숫자를 기억하는 배열을 선언한다. 
		 //char[] h = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'}; 
		System.out.println(index);
		System.out.print(number + " 를(을) " + n + "진수로 변환하면 ");
		for(int i=index-1 ; i>=0 ; i--) {
			//System.out.print(h[bin[i]]);
			if (bin[i]<10) {
				// bin 배열 요소에 저장된 값이 10 미만이면 bin 배열 요소에 저장된 값을 그대로 출력
				System.out.print(bin[i]);
			} else {
				// bin 배열 요소에 저장된 값이 10 이상이면 영문자로 변환해서 출력한다.
				System.out.print((char) (bin[i]+55));
			}
		}
		System.out.println(" 입니다.");
	}
}
