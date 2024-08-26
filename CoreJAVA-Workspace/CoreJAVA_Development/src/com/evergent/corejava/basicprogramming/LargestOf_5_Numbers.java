package com.evergent.corejava.basicprogramming;

public class LargestOf_5_Numbers {

	public static void main(String[] args) {
		int a=10,b=20,c=30,d=40, e=50;
		if(a>b&&a>c&&a>d&&a>e)
		{
			System.out.print(a+" is largest");
		}
		else if(b>a&&b>c&&b>d&&b>e)
		{
			System.out.print(b+" is largest");
		}
		else if(c>a&&c>d&&c>b&&c>e)
		{
			System.out.print(c+" is largest");
		}
		else if(d>a&&d>b&&d>c&&d>e)
		{
			System.out.print(d+" is largest");
		}
		else
		{
			System.out.print(e+" is largest");
		}

	}

}
