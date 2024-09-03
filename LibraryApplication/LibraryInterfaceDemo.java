package com.evergent.corejava.application6casestudy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LibraryInterfaceDemo 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        try 
        {
            // Get age input and determine user type
            System.out.println("Enter age:");
            int age = getValidAge(sc);
            if (age <= 12) 
            {
                KidUsers kidUser = new KidUsers();
                kidUser.registerAccount(age);
                System.out.println("Enter book type for Kid User:");
                String kidBookType = sc.next();
                kidUser.requestBook(kidBookType);
            } 
            else 
            {
                AdultUser adultUser = new AdultUser();
                adultUser.registerAccount(age);
                System.out.println("Enter book type for Adult User:");
                String adultBookType = sc.next();
                adultUser.requestBook(adultBookType);
            }
        } 
        catch (InputMismatchException e) 
        {
            System.out.println("Invalid input. Please enter a valid number.");
        } 
        finally 
        {
            sc.close();
        }
    }

    static int getValidAge(Scanner sc) 
    {
        int age = -1;
        while (age < 0) 
        {
            try 
            {
                age = sc.nextInt();
                if (age < 0) 
                {
                    System.out.println("Age cannot be negative. Please enter a valid age:");
                }
            } 
            catch (InputMismatchException e) 
            {
                System.out.println("Invalid input. Please enter a valid number for age:");
                sc.next(); // Clear invalid input
            }
        }
        return age;
    }
}