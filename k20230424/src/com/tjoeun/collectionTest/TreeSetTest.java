package com.tjoeun.collectionTest;

import java.util.TreeSet;
import java.util.Random;

public class TreeSetTest {
	
	public static void main(String[] args) {
		
		/* - TreeSet은 중복되는 데이터 입력을 허용하지 않는다.
		 - 데이터를 입력하는 순서와 입력된 데이터가 실제로 저장되는 순서가 달라 get(), set() 메소드가 제공되지 않는다. 
		 - TreeSet은 HashSet과 달리 입력되는 순서와 관계없이 오름차순으로 정렬되서 저장된다.*/
		TreeSet<Integer> tset = new TreeSet<>();
		
		//add(value) 메소드는 TreeSet에 Value를 저장한다. 
		tset.add(500);
		//size()메소드는 TreeSet에 저장된 데이터의 개수를 얻어온다.
		System.out.println(tset);
		System.out.println(tset.size());
		tset.add(100);
		System.out.println(tset);
		tset.add(999);
		System.out.println(tset);
		tset.add(5);
		System.out.println(tset);
		tset.add(100);
		System.out.println(tset); // 100이 추가되지 않는다. , ArrayList는 100이 추가되었을 것이다.
		
		//remove(value) 메소드는 TreeSet에 저장된 value를 제거한다.
		tset.remove(500);
		System.out.println(tset);
		
		//clear() 메소드는 TreeSet에 저장된 모든 데이터를 제거한다. 
		tset.clear();
		System.out.println(tset);
		System.out.println("===================================");
		
		//로또 1등 번호
		Random random = new Random();
		
		//몇번 돌지 모르기 대문에 while을 써야 한다.
		while(true) {
			int lotto = random.nextInt(45)+1;
			System.out.println(lotto);
			tset.add(lotto);
			//TreeSet 객체에 중복되지 않는 숫자 6개가 저장되면 무한루프를 탈출한다.
			if(tset.size() == 6 ) {
				break;
			}
		}
		System.out.println("1등 번호 : " + tset);
		int bonus = random.nextInt(45)+1;
		while(true) {
			bonus = random.nextInt(45)+1;
			System.out.println(bonus);
			tset.add(bonus);
			if(tset.size() == 7 ) {
				break;
			}
		}
		tset.remove(bonus);
		System.out.println("1등 번호 : " + tset + ", 보너스: " + bonus);
		System.out.println("===================================");
//		while(true) {
//			bonus = random.nextInt(45)+1;
//			System.out.println(bonus);
//			tset.add(bonus);
//			//contains() 메소드는 HaseSet 객체에 인수로 지정된 데이터가 포함되어 있다면 true, 그렇지 않으면 false를 리턴
//			if(tset.contains(bonus) == false) {
//				break;
//			}
//		}
		TreeSet<Integer> lottoh = new TreeSet<>();
		for(int i = 1 ; i<46 ; i++) {
			lottoh.add(i);
		}
		System.out.println(lottoh);
		for (int i = 0 ; i<40 ; i++) {
			lottoh.remove(i);
		}
		System.out.print("1등 번호 : " + lottoh);
		
	}
}
