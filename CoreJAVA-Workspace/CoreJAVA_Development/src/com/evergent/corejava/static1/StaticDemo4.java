package com.evergent.corejava.static1;
//Non-static methods can access static methods and variables.
public class StaticDemo4 {
	static String cname="India";
		   String name="Ravi";
	static public void myData()
	{
		System.out.println("my data : static method");
	}
	public void myShow()
	{
		myData();
		System.out.println("my show non static method"+cname);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(cname);
		myData();
		StaticDemo4 s4=new StaticDemo4();
		s4.myShow();
	}

}
