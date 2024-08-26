package com.evergent.corejava.exceptionhandling;

class ProductNotFoundException extends Exception{
	public ProductNotFoundException(String message)
	{
		System.out.println("Hello : "+message);
	}
}
public class UserDefinedExceptionDemo9{
	int pno=105;
	public void myData()throws ProductNotFoundException
	{
		if(pno>100)
		{
			throw new ProductNotFoundException("There is no products");
		}
		else
		{
			System.out.println("Product is there");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			UserDefinedExceptionDemo9 p1=new UserDefinedExceptionDemo9();
			p1.myData();
		}
		catch(ProductNotFoundException e)
		{
			System.out.println(e);
		}
	}

}
