package com.evergent.corejava.exceptionhandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class CompiletimeFileDemo 
{
	public static void main(String[] args) 
	{
		try
		{
			File file=new File("D:\\Files.txt");
			Scanner sc=new Scanner(file);
			while(sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
			}
			sc.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found : "+e.getMessage());
			e.printStackTrace();
		}
	}
}