package com.evergent.corejava.static1;

public class StaticDemo5 {
	static //static block
	{
		System.out.println("Static block:db/network connections");
	}
	static String cname="India";
	static public void myData()
	{
		System.out.println("My Data");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticDemo5.cname);
		StaticDemo5.myData();
	}
}
