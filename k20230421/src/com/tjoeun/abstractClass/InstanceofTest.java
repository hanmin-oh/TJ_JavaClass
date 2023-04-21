package com.tjoeun.abstractClass;

import java.util.ArrayList;
import java.util.Scanner;

abstract class Anmimal {
	
	 /*public void move() {
		System.out.println("동물이 움직입니다.");
	}  -- 자식 클래스에서 무시하면 의미가 없어지는 메소드 */
	
	public abstract void move();
	
	public void eating() {
		System.out.println("음식을 먹습니다.");
	}
}

// Human 크래스는 Animal 클래스를 상속받아 만든다.
class Human extends Anmimal {
	
	@Override
	public void move() {
		System.out.println("인간은 두 발로 걸어갑니다.");
	}
	
	public void readBooks( ) {
		System.out.println("인간은 책을 읽습니다.");
	}
}

// Tiger 크래스는 Animal 클래스를 상속받아 만든다.
class Tiger extends Anmimal {
	
	@Override
	public void move() {
		System.out.println("호랑이는 네 발로 걸어갑니다.");
	}
	
	public void hunting( ) {
		System.out.println("호랑이가 사냥을 합니다.");	
	}
}

// Eagle 크래스는 Animal 클래스를 상속받아 만든다.
class Eagle extends Anmimal {
	
	@Override
	public void move() {
		System.out.println("독수리는 날개로 날아갑니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 비행을 합니다.");
	}
}


public class InstanceofTest {
	
	public static void main(String[] args) {
		
		Anmimal[] anmimals = {new Human(), new Eagle(), new Tiger()};
		anmimals[0].move();
		anmimals[1].move();
		anmimals[2].move();
		System.out.println("=========================");
		
		
		/*
		moveAnimal(new Human()); 
		moveAnimal(new Tiger()); 
		moveAnimal(new Eagle()); */
		
		//upcasting, 자식 => 부모
		Anmimal hAnimal = new Human();
		Anmimal tAnimal = new Tiger();
		Anmimal eAnimal = new Eagle();
		
		/*main()이라는 static 메소드에서 moveAnimal() 바로 실행하기 대문에 moveAnimal() 메소드는
		 반드시 static으로 선언된 메소드여야 한다.*/

		/*
		moveAnimal(new Human()); 
		moveAnimal(new Tiger()); 
		moveAnimal(new Eagle()); */
		moveAnimal(hAnimal); 
		moveAnimal(tAnimal); 
		moveAnimal(eAnimal); 
		System.out.println("=========================");
		
		ArrayList<Anmimal> animalList = new ArrayList<>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		for(int i = 0 ; i < animalList.size() ; i++) {
			Anmimal animal = animalList.get(i);
			//douncasting된 클래스를 다시 원래의 타입으로 형변환시킨다.
			//instanceof 연산자를 사용해서 형변환이 가능한지 확인한 후 downcasting을 실행한다.
			if(animal instanceof Human) {
				Human human = (Human) animal; //downcasting, 부모에 저장된 자식 객체 => 자식
				human.readBooks();
			} else if(animal instanceof Tiger) {
				Tiger tiger = (Tiger) animal;
				tiger.hunting();
			} else if(animal instanceof Eagle) {
				Eagle eagle = (Eagle) animal;
				eagle.flying();
			}
		}
	}
	
	private static void moveAnimal(Anmimal animal) {
		animal.move();
	}

	
	
	
	
}
