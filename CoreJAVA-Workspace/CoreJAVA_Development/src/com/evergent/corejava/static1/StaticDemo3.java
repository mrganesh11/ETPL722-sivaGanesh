package com.evergent.corejava.static1;
//Static methods can't access non-static methods
public class StaticDemo3 {
	static String cname="India";
	String name="Ravi";
	static public void myData()
	{
		//myShow();//can't access non static method
		System.out.println("my data");
	}
	public void myShow()
	{
		System.out.println("my show non static method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(cname);
		myData();
	}

}
