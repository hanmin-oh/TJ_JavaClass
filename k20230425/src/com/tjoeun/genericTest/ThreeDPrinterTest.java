package com.tjoeun.genericTest;

public class ThreeDPrinterTest {
	
	public static void main(String[] args) {
		
		//Powder를 재료로 사용하는 3D 프린터를 만든다.
		ThreeDPrinterPowder printerPowder = new ThreeDPrinterPowder(); 
		Powder powder = new Powder();//Powder를 재료로 사용하는 3D 프린터에 사용할 재료를 만든다.
		printerPowder.setMaterial(powder);//3D 프린터에 재료를 넣는다.
		System.out.println(printerPowder.getMaterial()); //3D 프린터를 사용한다.
		powder = printerPowder.getMaterial(); //3D 프린터에서 재료를 꺼낸다.
		System.out.println("==========================");
		
		ThreeDPrinterPlastic printerPlastic = new ThreeDPrinterPlastic();
		Plastic plastic = new Plastic();
		printerPlastic.setMaterial(plastic);
		System.out.println(printerPlastic.getMaterial());
		plastic = printerPlastic.getMaterial();
		System.out.println("==========================");
		
		ThreeDPrinter printer = new ThreeDPrinter();
		printer.setMaterial(powder);//upcasting
		System.out.println(printer.getMaterial());
		powder = (Powder) printer.getMaterial();
		/* 자식 객체를 부모 객체에 넣을 때(upcasting)은 별다른 문제가 발생되지 않지만 부모 객체에
		 저장된 자식 객체를 자식 객체에 넣을 때(downcasting)는 반드시 형변환 시켜서 넣어야 한다. */
		System.out.println(powder); //정상적인 downcasting 이기 때문에 형변환 후 실행 가능
		System.out.println("==========================");
		
		printer.setMaterial(plastic);
		System.out.println(printerPlastic.getMaterial());
		plastic = (Plastic) printer.getMaterial();
		System.out.println(plastic);
		System.out.println("======== Generic =========");
		GenericPrinter<Powder> genericPrinter = new GenericPrinter<>();
		genericPrinter.setMaterial(powder);
		System.out.println(genericPrinter.getMaterial());
		powder = genericPrinter.getMaterial();
		
		GenericPrinter<Plastic> genericPrinter2 = new GenericPrinter<>();
		genericPrinter.setMaterial(null);
		System.out.println(genericPrinter2.getMaterial());
		plastic = genericPrinter2.getMaterial();
		System.out.println("======== Generic =========");
		
		Water water = new Water();
		printer.setMaterial(water);
		System.out.println(printer.getMaterial());
		water = (Water) printer.getMaterial();
		
		GenericPrinter<Water> genericPrinter3 = new GenericPrinter<>();
		genericPrinter3.setMaterial(water);
		System.out.println(genericPrinter3.getMaterial());
		water = genericPrinter3.getMaterial();
		
		
		
		
		
		
		
		
	}
}
