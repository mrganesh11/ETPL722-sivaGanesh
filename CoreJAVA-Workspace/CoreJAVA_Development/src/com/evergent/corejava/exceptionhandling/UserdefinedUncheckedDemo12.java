package com.evergent.corejava.exceptionhandling;
class InvalidScoreException extends RuntimeException
{
	public InvalidScoreException(String message)
	{
		super(message);
	}
}
public class UserdefinedUncheckedDemo12 {
	public static void validateScore(int score)
	{
		if(score<0||score>100)
		{
			throw new InvalidScoreException("Score must be between 0 and 100");
		}
		else
		{
			System.out.println("Score is valid");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			validateScore(110);
		}
		catch(InvalidScoreException e)
		{
			System.out.println("Caught the exception : "+e.getMessage());
			System.out.println(e);
		}
		System.out.println("program continues after handling exception");
	}

}
