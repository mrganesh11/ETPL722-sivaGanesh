package com.evergent.corejava.constructors;
class Animal
{
	private String name;
	private int age;
	public Animal(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void displayInfo()
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
}
class Dog extends Animal
{
	private String breed;
	public Dog(String name,int age,String breed)
	{
		super(name,age);
		this.breed=breed;
	}
	public void dispalyInfo()
	{
		super.displayInfo();
		System.out.println("Breed : "+breed);
	}
}
public class Employee8 {//INHERITANCE_OVERRIDING8

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog=new Dog("Buddy",5,"Golden Retriever");
		dog.dispalyInfo();
	}

}
