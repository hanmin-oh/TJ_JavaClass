package k20230413;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Spliterator;

public class StringMethod {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String str = "    tjoeunit    ";
	//length(): 문자열을 구성하는 문자의 개수를 얻어온다.(메소드)
		System.out.println("문자 개수: " + str.length());
		
	//trim() : 문자열 앞, 뒤의 불필요한 빈칸(공백)을 제거한다.	
		str = "    tjoeunit    ";
		System.out.println(str);
		System.out.println(str.trim());
		
	//메소드간 연결을 .으로 연결 --- 불필요한 공백의 개수의 길이와 입력할 때 공백 제거를 .trim 으로 연결
		/* System.out.println(str.trim().length());
		System.out.print("문자열 입력: ");
		String name = scanner.nextLine().trim();
		System.out.println(name); */
		
	//charAt(index) : 문자열에서 지정된 index 번째 위치의 문자를 얻어온다.
	//index는 0부터 시작된다. 
		/*str = "8304223185600";
		System.out.println("성별: " + str.charAt(6));
		char ch = scanner.nextLine().charAt(0);
		System.out.println(ch); */
		
	//toUpperCase()메소드는 영문자를 무조건 대문자로 변환하고 toLowerCase()메소드는 영문자를 소문자로	
		str = "TjoeunIT";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
	//sutString(a): 문자열의 a번째 index의 문자부터 문자열의 끝까지 얻어온다.
	//sutString(a , b) : 문자열의 a번째 index의 문자부터 b-1번재 index의 문자까지 얻어온다.	
		str = "8304223185600";
		System.out.println(str.substring(6));
		System.out.println(str.substring(0 , 7) + "******");
		System.out.println(str.substring(0 , 7));
		
	//indexOf()는 문자열의 왼쪽부터 검색해서 인수로 지정한 문자열이 최초로 나타나는 index를 얻어온다.  
	//lastIndexOf()는 문자열의 오른쪽부터 검색해서 인수로 지정한 문자열이 최초로 나타나는 index를 얻어온다.
		str = "itTjoeunit";
		System.out.println(str.indexOf("it"));
		System.out.println(str.lastIndexOf("it"));
	//찾는 문자열이 없으면 -1를 리턴한다.
	//두 메소드의 실행 결과가 0이상이면 인수로 지정된 문자열이 포함되엇다는 의미로 사용할 수 있다.
		
	//contains()는 문자열에 인수로 지정한 문자열이 포함되어 있으면 true, 없으면 false를 리턴한다.	
		str = "itTjoeunit";
		System.out.println(str.contains("it"));
		System.out.println(str.contains("IT"));
		
	//split("구분자") : 문자열을 구분자를 경계로 나눠서 배열로 리턴한다.
		str = "abc 123 가나다";
		System.out.println(str.split(" "));
		System.out.println(str.split(" ").length);
		System.out.println(Arrays.toString(str.split(" ")));
		System.out.println(str.split(" ")[0]);
		
	//replace(a,b) : 문자열의 모든 a를 b로 치환한다.	
		str = "itTjoeunit";
		System.out.println(str.replace("it", "아이"));
	
	//repeat(): 문자열을 인수로 지정한 개수만큼 반복한다.
		str = "8304223185600";
		System.out.println(str.substring(0 , 7) + "*".repeat(6));
		
	//과제 : '-' 사이의 번호를 *변환	
		str = "123-45678-12345";
		System.out.println(str.replace(str.substring(4,9), "*****"));
		str = "123-45678-12345";
		System.out.println( str.replace ( str.split("-")[1], "*".repeat( str.split("-")[1].length() ) ) );
		
		str = "123-45678-12345";
		System.out.println("앞쪽 '-'의 index : " + str.indexOf("-"));
		System.out.println("앞쪽 '-'의 index : " + str.lastIndexOf("-"));
		String code = str.substring(str.indexOf("-") +1 , str.lastIndexOf("-"));
		System.out.println(code);
		System.out.println(code.length());
		
		String newCode = str.substring(0 , str.indexOf("-") +1);
//		for(int i = 0 ; i < code.length() ; i++) {
//			newCode += "*";
//		}
		newCode += "*".repeat(code.length());
		newCode += str.substring(str.lastIndexOf("-"));
		System.out.println(newCode);
		
		String[] newCode2 = str.split("-");
		System.out.println(Arrays.toString(newCode2));
		System.out.printf("%s-%s-%s\n" , newCode2[0], "*".repeat(newCode2[1].length()), newCode2[2]);
		newCode = String.format("%s-%s-%s" , newCode2[0], "*".repeat(newCode2[1].length()), newCode2[2]);
		System.out.println(newCode);
		
		
	}
}
