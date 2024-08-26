package com.evergent.corejava.wrapperclasses;

public class Autoboxing_Unboxing {
	// Main driver method
	public static void main(String[] args) {
		//Autoboxing of character
		char ch1 = 'a';
		Character myc = new Character(ch1);
		//Auto - unboxing of character
		char ch = myc.charValue();
		// print Statements
		System.out.println("Value of ch : "+ch);
		System.out.println("Value of gfg "+myc);
	}

}

