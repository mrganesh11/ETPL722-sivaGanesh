package com.evergent.corejava.exceptionhandling;

public class ExceptionDemo3 {

	String name = "null";
	int k = 2;
	public void myData(){
		try {
			System.out.println("One");
			System.out.println(name.length());
			int t = 10/k;
			System.out.println(t);
			System.out.println("End");
		}
		catch(NullPointerException e) {
			System.out.println("I can handle : "+e);
		}
		catch(ArithmeticException e) {
			System.out.println("I can handle : "+e);
		}
	}
	public static void main(String[] args) {
		ExceptionDemo3 ed2 = new ExceptionDemo3();
		ed2.myData();
	}
}
