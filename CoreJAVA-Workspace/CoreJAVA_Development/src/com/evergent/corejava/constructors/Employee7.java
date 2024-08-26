package com.evergent.corejava.constructors;
class car
{
	String color;
	int maxSpeed;
	car()
	{
		color="White";
		maxSpeed=120;
	}
	car(String color,int maxSpeed)
	{
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	void display()
	{
		System.out.println("Color:"+color);
		System.out.println("maxSpeed:"+maxSpeed);
	}
}
public class Employee7 {

	public static void main(String[] args) {
		car car1=new car();
		car car2=new car("Red",150);
		car1.display();
		car2.display();

	}

}
