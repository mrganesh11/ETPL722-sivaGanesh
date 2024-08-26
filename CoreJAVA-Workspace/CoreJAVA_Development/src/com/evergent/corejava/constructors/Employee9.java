package com.evergent.corejava.constructors;

public class Employee9 {
	String name;
	int age;
	public Employee9(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public Employee9(Employee9 employee1)
	{
		this.name=employee1.name;
		this.age=employee1.age;
	}
	public void displayDetails()
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee9 employee1=new Employee9("Bhanu",20);
		Employee9 employee2=new Employee9(employee1);
		employee1.displayDetails();
		employee2.displayDetails();
		
	}

}
