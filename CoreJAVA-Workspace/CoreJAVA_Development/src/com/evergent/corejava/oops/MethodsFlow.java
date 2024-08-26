package com.evergent.corejava.oops;

public class MethodsFlow {
	//No arguments and No return type
	public void display()
	{
		System.out.println("No arguments and No return type");
	}
	//No arguments and with return type
	public int num() 
	{
		return 100;
	}
	//Arguments and No return type
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	//Arguments and with return type
	public int mul(int a,int b)
	{
		return a*b;
	}
	public static void main(String[] args)
	{
		MethodsFlow mf=new MethodsFlow();
		mf.display();
		int t=mf.num();
		System.out.println(t);
		mf.add(5, 10);
		int p=mf.mul(5,5);
		System.out.println(p);
		
	}
}