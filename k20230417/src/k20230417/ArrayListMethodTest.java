package k20230417;

import java.util.ArrayList;

public class ArrayListMethodTest {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		//add(value) : ArrayList의 맨 뒤에 value를 추가한다.
		list.add("홍길동");
		
		//size(): ArrayList에 저장된 데이터의 개수를 얻어온다.
		System.out.println(list.size() + ":" + list);
		list.add("임꺽정");
		System.out.println(list.size() + ":" + list);
		
		//add(index, value) : ArrayList의 index번째 위치에 value를 추가한다. -- 메소드 오버로딩..
		list.add(1, "손오공");
		System.out.println(list.size() + ":" + list);
		
		//set(index, value) : ArrayList의 index번째 위치에 value로 수정한다. 
		list.set(1, "김철수");
		System.out.println(list.size() + ":" + list);
		
		//get(index) : ArrayList의 index번째 위치를 가져온다.		
		System.out.println(list.get(2));
		
		for(int i = 0 ; i<list.size() ; i++) {
			System.out.print(list.get(i) + ",");
		}
		System.out.println();
		System.out.println("----");
		//향상된 for
		for(String str : list) {
			System.out.println(str);
		}
		System.out.println("----");
		
		//remove(index) : ArrayList의 index번째 위치를 삭제한다..		
		list.remove(2);
		System.out.println(list.size() + ":" + list);
		System.out.println("----");
	
		//remove(object) : ArrayList의 인수로 지정된 데이터를 삭제한다.. 같은 데이터가 있으면 앞의 데이터가 제거된
		list.remove("김철수");
		System.out.println(list.size() + ":" + list);
		
		System.out.println("----");
		//clear(): ArrayList의 모든 데이터를 제거한다.
		list.clear();
		System.out.println(list.size() + ":" + list);
		
	}
}
