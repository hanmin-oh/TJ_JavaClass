package k20230411;

public class WhileTest {
	
	public static void main(String[] args) {
		
		int sum = 0;
		for(int i = 1 ; i<=10 ; i++) {
			sum += i;
		}
		System.out.println(sum); 
		
		sum = 0;
		int i = 1;
		while(i<=10) {
			i++;
			sum += i;
		}
		System.out.println(sum);
		
		 //sum = 0;
		 //i = 1;
		sum = i = 0; // 0을 i에 저장하고 i에 저장된 값을 sum에 저장한다. 변수 선언시에는 사용할 수 없다.(기존 사용한 변수를 초기화)
		do {
			i++;
			sum += i;
		} while(i<=10);
		System.out.println(sum);
		 //while과 do while의 차이점 : 반복으로 최초 진입시 거짓이면 {}블록을 한 번도 실행하지 않는다. / 한번 실행한 후 조건을 물어본다.
	}
}
