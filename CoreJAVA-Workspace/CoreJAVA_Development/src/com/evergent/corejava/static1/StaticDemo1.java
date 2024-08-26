package com.evergent.corejava.static1;
//We can declare methods and variables as static
public class StaticDemo1
{
	static String cname="India";
	static public void myData()
	{
		System.out.println("My Data");
	}
	public static void main(String[] args)
	{
		System.out.println(StaticDemo1.cname);
		StaticDemo1.myData();
	}
}
