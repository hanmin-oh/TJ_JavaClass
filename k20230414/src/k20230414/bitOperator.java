package k20230414;

public class bitOperator {
	
	public static void main(String[] args) {
		
		//비트연산자
		//& : 두 비트가 모두 1이면 1
		//| : 비트 or, 두 비트 중에서 1비트 이상 1이면 1
		//^ : 비트 xor(베타적 논리합), 두 비트가 다를 때 1 
		//~ : 비트 부정, 1은 0으로 0은 1로, 1의 보수를 계산한다.
		
		int a = 10; //0000 1010
		int b = 12; //0000 1100
		
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(~a);
		
		//1111 0011
	}
}
