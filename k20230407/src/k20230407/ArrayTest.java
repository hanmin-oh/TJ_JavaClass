package k20230407;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class ArrayTest {

	public static void main(String[] args) {
		
//		배열이란 같은 이름으로 여러개의 기억장소를 만든다. 기억장소 구분은 인덱스(첨자)를 이용한다.
//		배열을 선언만 한다.
//		자료형[] 배열이름 = new 자료형[첨자];
//		자료형 배열이름[];
		
//		배열을 선언만 하면 기본초기화가 실행된다.
//		숫자는 0, 문자는 공백, boolean은 false, 기본 자료형을 제외한 나머지(클래스로 만든 객체)는 null
		
		String[] data = new String[5];
		System.out.println(Arrays.toString(data));
		
//		배열을 선언하고 초기치로 초기화한다.
//		자료형[] 배열이름 = [초기치] / 초기치로 지정된 데이터의 개수만큼 배열을 선언하고 초기화한다.
		
		String[] name = {"오한민", "김철수", "이영희" };
		System.out.println(Arrays.toString(name));
		
		System.out.println(name[0]);
		System.out.println("=============================");
		
//		for (int i = 0 ; i<1 ; i++) {
//			System.out.println(name[i]);
//		}
		
//		배열 이름.length: 배열의 크기를 얻어온다.
		System.out.println("배열의 크기: " + name.length);
		
		System.out.println("### 배열의 길이를 이용한 for문 ###");
		for (int i = 0 ; i< name.length ; i++) {
			System.out.println(name[i]);
		}
		
		System.out.println("### 향상된 for문 ###");
//		향상된 for: 배열 전체를 대상으로 작업할 경우 사용하면 편리하다.
//		for (배열의 자료형 변수이름 : 배열이름) {
//			반복할 자료형 변수이름 : 배열이름
//		}
		
//		name 배열의 0번째 인덱스에 저장된 데이터가 str 변수에 저장된 후 반복이 시작되고
//		name 배열의 마지막 인덱스에 저장된 데이터가 str 변수에 저장된 후 처리되면 반복이 종료된다.
		for (String str : name) {
			System.out.println(str);
		}	
	}
}
