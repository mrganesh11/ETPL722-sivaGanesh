package com.evergent.corejava.wrapperclasses;

public class WrapperClassesDemo2 {

	public static void main(String[] args) {
		float f1 = 4.5f;
		Float f2 = new Float(f1);
		Float f3 = f2.floatValue();
		
		double d1 = 4.5f;
		Double d2 = new Double(d1);
		double d3 = d2.doubleValue();
		
		byte b1 = 10;
		Byte b2 = new Byte(b1);
		byte bb3 = b2.byteValue();
		
		//Float value
		System.out.println("Float value is : "+f1);
		System.out.println("Float Object value is : "+f2);
		System.out.println("Convert Integer Object vakue to primitive : "+f3);
		
		// Double value
		System.out.println("Double value is : "+d1);
		System.out.println("Double Object value is : "+d2);
		System.out.println("Convert Integer Object vakue to primitive : "+d3);
		
		//Byte value
		
		System.out.println("Byte value is : "+b1);
		System.out.println("Byte Object value is : "+b2);
		System.out.println("Convert Integer Object vakue to primitive : "+bb3);

	}

}