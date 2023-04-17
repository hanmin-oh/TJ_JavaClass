package k20230417;

import java.util.ArrayList;

public class ArrayListTest {
	
	public static void main(String[] args) {
		
		//배열은 한 번 선언하면 프로그램에서 크기를 변경할 수 없다.
		int[] data = new int [10];
		
		for(int i = 0 ; i<10 ; i++) {
			data[i] = i+1;
		}
		for(int i = 0 ; i<10 ; i++) {
			System.out.printf("data[%d] = %d\n" , i , data[i]);
		}
		
		//배열은 인덱스가 배열의 범위를 벗어나면 ArrayIndexOfBoundOfExceptiond이 발생된다.
		 /*for(int i = 10 ; i<20 ; i++) {
			data[i] = i+1;
		 }*/
		
		/*ArrayList는 데이터가 삽입되면 자동으로 크기가 커지고 제거되면 자동으로 크기가 작아진다. 
		중간에 데이터가 삽입되면 삽입되는 위치부터 모든 데이터가 뒤로 이동되고 중간에 데이터가 제거되면 
		제거된 데이터 다음 위치부터 모든 데이터가 앞으로 이동된다.*/
		
		/* JDK 1.4 버전 이전까지는 -- ArrayList list = new ArrayList(); 어떤 타입을 저장하는 배열리스트인지는 
		모른다. */
		
		/*<E> : 제네릭이라 부르며 ArrayList에 저당할 데이터의 타입을 반드시 클래스로 적어야 한다.
		==> 기본 자료형을 사용할 수 없다. -- ArrayList<int> ==> 사용 불가 -- 
		기본 자료형 데이터를 저장하는 ArrayList를 만들어야 할 경우 기본 자료형을 클래스와 
		시켜놓은 랩퍼 클래스를 사용해야 한다. ==> 랩퍼 클래스는 기본 자료형의 첫 문자만 대문자로 바꾸며 된다. 
		단, Int는 Integer , char은 Character를 사용한다. */
		//ArrayList<Integer> list = new ArrayList<Integer>(); -- JDK 1.5버전 이후
		ArrayList<Integer> list = new ArrayList(); //JDK 1.7버전 이후
		
		for(int i = 0 ; i<10 ; i++) {
			list.add(i + 1);
		}
		for(int i = 0 ; i<10 ; i++) {
			System.out.printf("list.get[%d] = %d\n" , i , list.get(i));
		}
		for(int i = 10 ; i<20 ; i++) {
			list.add(i + 1);
		}
		for(int i = 10 ; i<20 ; i++) {
			System.out.printf("list.get[%d] = %d\n" , i , list.get(i));
		}
		//ArrayList도 인덱스가 범위를 벗어나면 IndexOfBoundOfException가 발생된다.
			System.out.println(list.get(20));
		
	}
	
}
