package com.evergent.corejava.exceptionhandling;

public class ExceptionDemo7throws {
	String name=null;
	int k=1;
	public void myData()throws NullPointerException
	{
		System.out.println("One");
		System.out.println(name.length());
		System.out.println("End");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			ExceptionDemo7throws ed=new ExceptionDemo7throws();
			ed.myData();
		}
		catch(Exception e)
		{
			System.out.println("I can handle: "+e);
		}
	}

}
