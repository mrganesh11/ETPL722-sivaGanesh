package com.evergent.corejava.constructors;

public class Employee4 {
//Constructor doesn't have return type not even void also
//If we declared as void it will consider as method not a constructor.
	void Employee4()
	{
		System.out.println("Default Constructor");
	}
	public static void main(String[] args) {
		Employee4 emp4=new Employee4();
		emp4.Employee4();
	}

}
