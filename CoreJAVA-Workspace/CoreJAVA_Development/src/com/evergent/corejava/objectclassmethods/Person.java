package com.evergent.corejava.objectclassmethods;

public class Person 
{
	String name;
	int age;
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public String toString()
	{
		return "Name: "+name+" \nAge : "+age;
	}
}
