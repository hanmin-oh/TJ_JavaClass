package com.tjoeun.collectionTest;

import java.util.HashMap;

public class HashMapTest2 {
	
	public static void main(String[] args) {
		
		/*HashMap은 사전식으로 데이터를 저장한다. Key(K)에 Value(V)를 할당하는 방식으로 저장된다.
		 - Key는 String 타입으로 저장하고 Value는 저장할 데이터 타입으로 지정한다.   */
		HashMap<String, Integer> hmap = new HashMap<>();
		
		//put(key , value) 메소드는 HashMap의 Key에 Value를 저장한다.
		hmap.put("apple" , 1000);
		//size() 메소드로 저장된 데이터의 개수를 얻어올 수 있다.
		System.out.println(hmap.size() + " :" + hmap);
		hmap.put("banana" , 500);
		System.out.println(hmap.size() + " :" + hmap);
		hmap.put("orange", 1500);
		
		/* HashMap에 저장된 데이터를 수정하려면 put(key, vlaue)를 사용해서 수정한다.
		 -put() 메소드로 없는 key에 데이터를 할당하면 데이터가 저장되고 있는 key에 데이터를 할당하면
	     그 key에 저장된 데이터가 수정된다. */
		hmap.put("banana" , 1500);
		System.out.println(hmap.size() + " :" + hmap);
		
		//get(key) 메소드는 HashMap에 저장된 데이터 중에서 key에 해당되는 value를 얻어온다.
		System.out.println(hmap.get("banana"));
		//존재하지 않는 key를 get() 메소드의 인수로 넘기면 null이 리턴된다.
		System.out.println(hmap.get("banannaa"));
		//remove(key)메소드는 HashMap에 저장된 데이터 중에서 Key에 해당하는 데이터를 제거한다.
		hmap.remove("banana");
		System.out.println(hmap.size() + " :" + hmap);
		
		
		//clear() 메소드는 HashMap에 저장된 모든 데이터를 제거한다. 
		hmap.clear();
		System.out.println(hmap.size() + " :" + hmap);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
