package com.evergent.corejava.ganesh.application4;

import java.io.IOException;
import java.util.Scanner;

// Main class for the Pharmacy application
public class PharmacyApplication 
{
    // Instances of the different tabs in the application
    InventoryTab inventoryTab = new InventoryTab();
    SalesTab salesTab = new SalesTab();
    AccountTab accountTab = new AccountTab();

    // Method to start the application and display the main menu
    public void start(Scanner sc) throws IOException 
    {
        while(true)
        {
            // Display the main menu options
            displayMainMenu();
            
            // Get user choice and convert it to uppercase
            String userChoice = sc.nextLine().toUpperCase();
            
            // Process user choice
            switch(userChoice)
            {
                case "I":
                    // Handle Inventory Tab
                    handleTab(inventoryTab, sc);
                    break;
                case "S":
                    // Handle Sales Tab
                    handleTab(salesTab, sc);
                    break;
                case "A":
                    // Handle Account Tab
                    handleTab(accountTab, sc);
                    break;
                case "E":
                    // Exit the application
                    System.out.println(ColorUtils.SUCCESS_COLOR + "Exiting the application. Thank you!" + ColorUtils.RESET);
                    sc.close();  // Close the scanner
                    System.exit(0);  // Exit the program
                    break;
                default:
                    // Handle invalid choices
                    System.out.println(ColorUtils.ERROR_COLOR + "Invalid choice. Please try again." + ColorUtils.RESET);
            }
        }
    }

    // Method to display the main menu
    void displayMainMenu() 
    {
        System.out.println(ColorUtils.INFO_COLOR + "========================" + ColorUtils.RESET);
        System.out.println(ColorUtils.INFO_COLOR + "| Pharmacy Main Menu   |" + ColorUtils.RESET);
        System.out.println(ColorUtils.INFO_COLOR + "========================" + ColorUtils.RESET);
        System.out.println(ColorUtils.INFO_COLOR + "| I - Inventory Tab    |" + ColorUtils.RESET);
        System.out.println(ColorUtils.INFO_COLOR + "| S - Sales Tab        |" + ColorUtils.RESET);
        System.out.println(ColorUtils.INFO_COLOR + "| A - Account Tab      |" + ColorUtils.RESET);
        System.out.println(ColorUtils.INFO_COLOR + "| E - Exit             |" + ColorUtils.RESET);
        System.out.println(ColorUtils.INFO_COLOR + "========================" + ColorUtils.RESET);
        System.out.print(ColorUtils.INPUT_COLOR + "Enter your Choice (I, S, A, E): " + ColorUtils.RESET);
    }

    // Method to handle the selected tab (Inventory, Sales, or Account)
    void handleTab(MenuTab tab, Scanner sc) 
    {
        while(true)
        {
            // Display the tab's menu
            tab.displayMenu();
            
            // Get user's choice and convert to uppercase
            String choice = sc.nextLine().toUpperCase();
            
            if(choice.equals("M")) 
            {
                // If the choice is 'M', return to the main menu
                break;
            }
            
            // Handle the choice within the tab
            tab.handleChoice(choice, sc);
        }
    }

    // Main method to start the application
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n" + ColorUtils.INFO_COLOR + "\t\t\t\t** WELCOME TO PHARMACY MANAGEMENT **" + ColorUtils.RESET);
        PharmacyApplication pa = new PharmacyApplication();
        pa.start(sc);
    }
}