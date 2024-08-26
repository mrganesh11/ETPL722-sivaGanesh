package com.evergent.corejava.basicprogramming;
import java.util.Scanner;
public class Scanner_Example {
	public static void main(String[] args)
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter your name: ");
			String name=sc.next();
			System.out.println(name+" Enter two numbers :");
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println(a+b);
		}
		
	}
}
