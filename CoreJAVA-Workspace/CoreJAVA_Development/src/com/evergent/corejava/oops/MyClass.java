package com.evergent.corejava.oops;

public class MyClass extends Calculation {
	public void show()
	{
		System.out.println("Show method local class");
	}
	public static void main(String[] args)
	{
		MyClass my=new MyClass();
		my.show();
		my.addition();
	}
}
