package com.tjoeun.collectionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.StringTokenizer;

public class HashMapTest2 {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> hmap = new HashMap<>();
		
		hmap.put("apple" , 1000);
		System.out.println(hmap.size() + " :" + hmap);
		hmap.put("banana" , 500);
		System.out.println(hmap.size() + " :" + hmap);
		hmap.put("orange", 1500);
		System.out.println(hmap.size() + " :" + hmap);
		hmap.put("banana" , 3500);
		System.out.println(hmap.size() + " :" + hmap);
		
		
		//keySet() 메소드는 HashMap에 저장된 데이터의 key만 얻어온다.
		System.out.println(hmap.keySet());
		//values() 메소드는 HashMap에 저장된 데이터의 value만 얻어온다.
		System.out.println(hmap.values());
		System.out.println("=============================");
		
		//HashMap에 저장된 데이터의 key만 얻어와서 ArrayList에 저장하기
		ArrayList<String> list = new ArrayList<>();
		for(String str : hmap.keySet()) {
			list.add(str);
		}
		System.out.println("배열 list: " + list);
		
		//HashMap에 저장된 데이터의 value만 얻어와서 ArrayList에 저장하기
		ArrayList<Integer> list2 = new ArrayList<>();
		for(int a : hmap.values()) {
			list2.add(a);
		}
		System.out.println("배열 list2: " + list2);
		
		//HashMap에 저장된 데이터의 key를 이용해서 value를 얻어와서 ArrayList에 저장하기
		/*get(key) 메소드는 HashMap에 저장된 데이터 중에서 key에 해당되는 value를 얻어온다.
		ArrayList<Integer> list3 = new ArrayList<>();
		System.out.println(hmap.get("banana"));
		for(int i = 0 ; i <list3.size() ; i++) {
			hmap.get("banana");
			System.out.println(hmap.get("orange"));
		} */
		
		
		
		
	}
}
