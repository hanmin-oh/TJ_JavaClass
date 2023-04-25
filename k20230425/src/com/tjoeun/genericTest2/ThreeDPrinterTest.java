package com.tjoeun.genericTest2;


public class ThreeDPrinterTest {
	
	public static void main(String[] args) {
		
		
		GenericPrinter<Powder> genericPrinter = new GenericPrinter<>();
		genericPrinter.setMaterial(new Powder());
		System.out.println(genericPrinter.getMaterial());
		Powder powder = genericPrinter.getMaterial();
		
		GenericPrinter<Plastic> genericPrinter2 = new GenericPrinter<>();
		genericPrinter2.setMaterial(new Plastic());
		System.out.println(genericPrinter2.getMaterial());
		Plastic Plastic = genericPrinter2.getMaterial();
		System.out.println("======== Generic =========");
		
		Water water = new Water();
		//GenericPrinter<Water> genericPrinter3 = new GenericPrinter<>(); -에러 발생
		
		
		
		
		
		
		
		
		
	}
}
