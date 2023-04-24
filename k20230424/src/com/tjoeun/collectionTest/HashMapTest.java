package com.tjoeun.collectionTest;

import java.util.HashMap;

public class HashMapTest {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> hmap = new HashMap<>();
		
		hmap.put("apple" , 1000);
		System.out.println(hmap.size() + " :" + hmap);
		hmap.put("banana" , 500);
		System.out.println(hmap.size() + " :" + hmap);
		hmap.put("orange", 1500);
		System.out.println(hmap.size() + " :" + hmap);
		hmap.put("banana" , 1500);
		System.out.println(hmap.size() + " :" + hmap);
		
		
		//keySet() 메소드는 HashMap에 저장된 데이터의 key만 얻어온다.
		System.out.println(hmap.keySet());
		//values() 메소드는 HashMap에 저장된 데이터의 value만 얻어온다.
		System.out.println(hmap.values());
		
		//HashMap에 저장된 데이터의 key만 얻어와서 ArrayList에 저장하기
		
		//HashMap에 저장된 데이터의 value만 얻어와서 ArrayList에 저장하기
		
		//HashMap에 저장된 데이터의 key를 이용해서 value를 얻어와서 ArrayList에 저장하기
		
		
		
		
		
	}
}
