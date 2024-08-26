package com.evergent.corejava.strings.immutable;

public class MyData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImmutableString str =new ImmutableString("Hello, String World!");
		System.out.println(str.toString());
		System.out.println(str.myValue());
	}

}
