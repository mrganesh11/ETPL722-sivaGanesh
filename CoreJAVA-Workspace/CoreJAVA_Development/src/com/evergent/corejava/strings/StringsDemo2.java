package com.evergent.corejava.strings;
public class StringsDemo2 
{
	public static void main(String[] args)
	{
		String str1="Java";
		String str2="Java";
		if(str1==str2)
			System.out.println("True");
		else
			System.out.println("False");
		if(str1.equals(str2))
			System.out.println("True");
		else
			System.out.println("False");
	}
}