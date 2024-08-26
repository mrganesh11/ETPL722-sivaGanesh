package com.evergent.corejava.strings;

public class Splitdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java is a powerful programming language";
		String[] words=str.split(" ");
		for(String w:words)
		{
			System.out.println(w);
		}
	}

}
