package com.evergent.corejava.exceptionhandling;

public class ExceptionDemo4 {

	String name = "null";
	public void myData(){
		try {
			System.out.println("One");
			System.out.println(name.length());
			System.out.println("End");
		}
		catch(NullPointerException e) {
			System.out.println("I can handle : "+e);
		}
		catch(ArithmeticException e) {
			System.out.println("I can handle : "+e);
		}
		catch(Exception e) {
			System.out.println("I can handle : "+e);
		}
	}
	public static void main(String[] args) {
		ExceptionDemo4 ed2 = new ExceptionDemo4();
		ed2.myData();
	}
}
