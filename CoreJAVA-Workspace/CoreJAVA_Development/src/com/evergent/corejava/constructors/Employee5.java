package com.evergent.corejava.constructors;
public class Employee5 
{
	int eno;
	String ename;
	double sal;
	Employee5()
	{
		System.out.println("Default Constructor");
	}
	Employee5(int eno)
	{
		this.eno=eno;
	}
	Employee5(int eno,String ename,double sal)
	{
		this(eno);
		this.ename=ename;
		this.sal=sal;
	}
	public void display()
	{
		System.out.println("Employee no:"+eno);
		System.out.println("Employee name:"+ename);
		System.out.println("Employee salary:"+sal);
	}
	public static void main(String[] args) 
	{
		new Employee5();
		Employee5 emp2=new Employee5(123,"Raj",50000);
		emp2.display();
	}
}