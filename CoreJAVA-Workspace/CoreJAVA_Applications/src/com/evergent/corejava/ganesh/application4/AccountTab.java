package com.evergent.corejava.ganesh.application4;

import java.util.Scanner;

// Class for managing account-related operations
public class AccountTab extends BaseTab 
{
    // Implementation of the abstract method from BaseTab
    protected void printHeader(String title)
    {
        System.out.println(ColorUtils.HEADER_COLOR + "===========================" + ColorUtils.RESET);
        System.out.println(ColorUtils.HEADER_COLOR + "       " + title + "         " + ColorUtils.RESET);
        System.out.println(ColorUtils.HEADER_COLOR + "===========================" + ColorUtils.RESET);
    }

    // Static variables to hold account details
    private static String accountName = "Default User";
    private static String accountEmail = "user@example.com";

    // Displays the menu options for the Account tab
    public void displayMenu() 
    {
        printHeader("My Account");
        System.out.println(ColorUtils.INFO_COLOR + "| V - View Account        |" + ColorUtils.RESET);
        System.out.println(ColorUtils.INFO_COLOR + "| U - Update Account      |" + ColorUtils.RESET);
        System.out.println(ColorUtils.INFO_COLOR + "| M - Return to Main Menu |" + ColorUtils.RESET);
        System.out.println(ColorUtils.INFO_COLOR + "===========================" + ColorUtils.RESET);
        System.out.print(ColorUtils.INPUT_COLOR + "Enter your Choice (V,U,M) : " + ColorUtils.RESET);
    }

    // Handles user choices for account operations
    public void handleChoice(String choice, Scanner sc) 
    {
        switch(choice)
        {
            case "V":
                viewAccountDetails();
                break;
            case "U":
                updateAccountDetails(sc);
                break;
            case "M":
                break; // Return to Main Menu, no action needed
            default:
                System.out.println(ColorUtils.ERROR_COLOR + "Invalid choice. Please try again." + ColorUtils.RESET);
        }
    }

    // Displays current account details
    private void viewAccountDetails() 
    {
        System.out.println(ColorUtils.INFO_COLOR + "=================================" + ColorUtils.RESET);
        System.out.println(ColorUtils.INFO_COLOR + "|          Account Details      |" + ColorUtils.RESET);
        System.out.println(ColorUtils.INFO_COLOR + "=================================" + ColorUtils.RESET);
        System.out.println("Name: " + accountName);
        System.out.println("Email: " + accountEmail);
    }

    // Updates the account details with user input
    private void updateAccountDetails(Scanner sc)
    {
        System.out.print(ColorUtils.INPUT_COLOR + "Enter new account name: " + ColorUtils.RESET);
        accountName = sc.nextLine();
        System.out.print(ColorUtils.INPUT_COLOR + "Enter new account email: " + ColorUtils.RESET);
        accountEmail = sc.nextLine();
        System.out.println(ColorUtils.SUCCESS_COLOR + "Account details updated successfully." + ColorUtils.RESET);
    }
}