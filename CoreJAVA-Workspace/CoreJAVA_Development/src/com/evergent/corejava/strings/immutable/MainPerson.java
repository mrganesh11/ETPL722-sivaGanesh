package com.evergent.corejava.strings.immutable;
/*The PersonImmutable class is immutable because once an instance is created,
 * the name and age cannot be changed*/
public class MainPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonImmutable person=new PersonImmutable("Raju",30);
		System.out.println("Name : "+person.myName());
		System.out.println("Age : "+person.myAge());
	}

}
