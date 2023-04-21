package com.tjoeun.abstractClass;

import java.util.Scanner;

abstract /* 다형성(Polymophism)이란 같은 메소드가 서로 다른 클래스에서 다양하게 실행되는 것을 말한다. 
다형성을 구현하기 위해서는 다형성을 구현할 메소드가 포함된 모든 클래스가 같은 부모 클래스를 
가져야 하고 부모와 자식 클래스에 같은 이름의 메소드가 있어야 하며 자식 클래스에서 부모 클래스의
메소드를 반드시 Override시켜서 사용해야 한다.

*/

class Shape {
	int x , y;
	void move() {}
	abstract void draw() ; //=>다형성을 구현할 메소드
 
}

// Shape 클래스를 상속받아 Point 클래스를 만든다. 
class Point extends Shape {
	
	@Override
	void draw() {
		System.out.println(".을 찍는다.");
	}
	
}

// Shape 클래스를 상속받아 Line 클래스를 만든다.
class Line extends Shape {
	
	@Override
	void draw() {
		System.out.println("선을 그린다.");		
	}
}

// Shape 클래스를 상속받아 Circle 클래스를 만든다. 
class Circle extends Shape {
	
	@Override
	void draw() {
		System.out.println("원을 그린다.");		
	}
}

// Shape 클래스를 상속받아 Rectangle 클래스를 만든다.
class Rectangle extends Shape {
	
	@Override
	void draw() {
		System.out.println("사각형을 그린다.");		
	}
}

// Shape 클래스를 상속받아 Triangle 클래스를 만든다. 
class Triangle extends Shape {
	
	@Override
	void draw() {
		System.out.println("삼각형을 그린다. ");		
	}
}

public class PolymophismTest {
	
	public static void main(String[] args) {
		Shape shape = new Point();
		shape.draw();
		shape = new Line();
		shape.draw();
		shape = new Circle();
		shape.draw();
		shape = new Rectangle();
		shape.draw();
		shape = new Triangle();
		shape.draw();
		System.out.println("==================");
		
		Shape[] shapes = {new Point(), new Line(), new Point(), new Rectangle(), new Triangle()};
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("원하는 작업을 선택하세요: ");
		int menu = scanner.nextInt();
		
		shapes[menu-1].draw();
		
		
		
	}
	
	
	
}
