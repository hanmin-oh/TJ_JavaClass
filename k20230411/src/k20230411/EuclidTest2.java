package k20230411;

import java.util.Scanner;

public class EuclidTest2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int a, b;
		int r = 1;
		System.out.print("a: ");
		a = scanner.nextInt();
		System.out.print("b: ");
		b = scanner.nextInt();
		int high, low;
		if(a > b) {
			high = a; low = b;
		} else {
			high = b; low = a;
		}
		while( r > 0) {
			r = high % low;
			high = low;
			low = r;
		}
		
		int l = a * b / high;
		
		System.out.printf(" %d와 %d의 최대공약수 : %d\n ", a , b , high);
		System.out.printf("%d와 %d의 최소공배수 : %d\n ", a , b , l);
	}
}