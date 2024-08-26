package com.evergent.corejava.exceptionhandling;

public class StackOverFlowErrorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			recursivemethod();
		}
		catch(StackOverflowError e)
		{
			System.out.println("Error caught : "+e.getMessage());
		}
	}

	public static void recursivemethod() {
		// TODO Auto-generated method stub
		recursivemethod();
	}

}
