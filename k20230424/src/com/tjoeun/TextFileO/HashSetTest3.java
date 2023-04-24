package com.tjoeun.TextFileO;

import java.util.HashSet;

public class HashSetTest3 {

	public static void main(String[] args) {
		HashSet<Person> hset = new HashSet<>();
		
		/* - new를 사용해서 객체를 사용하면 기존에 생성했던 객체와 내용이 같더라도 다른 hash코드가 부여된다.
		 - HashSet과 TreeSet은 중복되는 데이터 판단을 hashCode로 하기 때문에 내용이 같더라도 다른 hashCode를 가지면
		 서로 다른 객체로 취급해서 내용이 같은 객체가 저장된다.     
		 - 저장된 내용이 같은 객체를 같은 객체로 인식하게 하려면 hashCode() 메소드를 Override 해서 내용이
		 같은 객체는 같은 hashCode를 가지게 하면 된다.   */ 
		
		hset.add(new Person("이순신" , 25));
		System.out.println(hset);
		hset.add(new Person("이순신" , 25));
		System.out.println(hset);
		hset.add(new Person("이순신" , 35));
		System.out.println(hset);
		hset.add(new Person("이순신" , 45));
		System.out.println(hset);
		hset.add(new Person("이순신" , 55));
		System.out.println(hset);
		hset.add(new Person("을지문덕" , 55));
		System.out.println(hset);
		hset.add(new Person("강감찬" , 39));
		System.out.println(hset);
		
	}

}
