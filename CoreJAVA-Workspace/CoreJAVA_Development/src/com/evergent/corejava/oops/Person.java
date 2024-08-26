package com.evergent.corejava.oops;

public class Person {
	String pname="Siva";
	int page=23;
	String paddress="Kurnool";
	public void display()
	{
		System.out.println("Person name: "+pname+"\nPerson age: "+page+"\nperson address: "+paddress);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person();
		p.display();
	}

}
