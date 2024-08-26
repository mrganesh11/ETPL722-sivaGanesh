package com.evergent.corejava.oops;

public class Calculation {
	int a=10,b=20,c;
	public void addition()
	{
		c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation cal=new Calculation();
		cal.addition();
		
	}
}
