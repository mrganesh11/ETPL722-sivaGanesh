package com.evergent.corejava.exceptionhandling;

public class ExceptionDemo8throws {
	String name=null;
	int k=0;
	public void myData()throws NullPointerException
	{
		System.out.println("One");
		System.out.println(name.length());
		System.out.println("End");
	}
	public void myChange() throws NullPointerException
	{
		myData();
		System.out.println("my change method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			ExceptionDemo8throws ed=new ExceptionDemo8throws();
			ed.myChange();
		}
		catch(Exception e)
		{
			System.out.println("I can handle: "+e);
		}
	}

}
