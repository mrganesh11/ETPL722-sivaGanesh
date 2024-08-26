package com.evergent.corejava.static1;
//We can access static variables and methods direct through 
//classname.methodname and classname.variablename
public class StaticDemo2 {
	static String cname="India";
	static public void myData()
	{
		System.out.println("my data");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(cname);
		myData();
	}

}
