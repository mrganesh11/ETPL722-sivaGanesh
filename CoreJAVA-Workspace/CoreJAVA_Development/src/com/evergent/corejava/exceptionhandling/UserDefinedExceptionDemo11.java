package com.evergent.corejava.exceptionhandling;

class InsufficientFundsException extends Exception
{
	public InsufficientFundsException(String message)
	{
		super(message);
	}
}
public class UserDefinedExceptionDemo11 {
	public static void withdraw(double amount)throws InsufficientFundsException
	{
		double balance=500.00;
		if(amount>balance)
		{
			throw new InsufficientFundsException("Insufficient funds for withdrawl");
		}
		else
		{
			System.out.println("Withdrawl successful!!!");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			withdraw(600.00);
		}
		catch(InsufficientFundsException e)
		{
			System.out.println("Caught InsufficientFundsException : "+e.getMessage());
			System.out.println(e);
		}
		System.out.println("Program continues after handling the exception");
	}

}
