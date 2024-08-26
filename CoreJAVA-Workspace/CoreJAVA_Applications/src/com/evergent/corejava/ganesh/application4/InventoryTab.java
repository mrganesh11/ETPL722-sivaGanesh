package com.evergent.corejava.ganesh.application4;

import java.util.Scanner;

// InventoryTab class for managing inventory-related operations
public class InventoryTab extends BaseTab 
{
    // Displays the menu options for the Inventory tab
    public void displayMenu() 
    {
        printHeader("Inventory"); // Print the menu header
        System.out.println(ColorUtils.INFO_COLOR + "| C - Check Medicine      |" + ColorUtils.RESET);
        System.out.println(ColorUtils.INFO_COLOR + "| B - Browse Medicines    |" + ColorUtils.RESET);
        System.out.println(ColorUtils.INFO_COLOR + "| U - Update Medicine     |" + ColorUtils.RESET);
        System.out.println(ColorUtils.INFO_COLOR + "| M - Return to Main Menu |" + ColorUtils.RESET);
        System.out.println(ColorUtils.INFO_COLOR + "===========================" + ColorUtils.RESET);
        System.out.print(ColorUtils.INPUT_COLOR + "Enter your Choice (C,B,U,M) : " + ColorUtils.RESET);
    }

    // Handles user choices for inventory operations
    public void handleChoice(String choice, Scanner sc) 
    {
        switch(choice)
        {
            case "C":
                checkMedicine(sc); // Handle checking medicine
                break;
            case "B":
                browseMedicines(); // Handle browsing medicines
                break;
            case "U":
                updateMedicineCost(sc); // Handle updating medicine cost
                break;
            case "M":
                break; // Return to Main Menu, no action needed
            default:
                System.out.println(ColorUtils.ERROR_COLOR + "Invalid choice. Please try again." + ColorUtils.RESET);
        }
    }

    // Prints a header with a title
    void printHeader(String title)
    {
        System.out.println(ColorUtils.HEADER_COLOR + "===========================" + ColorUtils.RESET);
        System.out.println(ColorUtils.HEADER_COLOR + "       " + title + "         " + ColorUtils.RESET);
        System.out.println(ColorUtils.HEADER_COLOR + "===========================" + ColorUtils.RESET);
    }

    // Checks the availability and cost of a medicine based on code
    void checkMedicine(Scanner sc) 
    {
        System.out.print(ColorUtils.INPUT_COLOR + "Enter Medicine Code (A, B, C): " + ColorUtils.RESET);
        String medicineCode = sc.nextLine().toUpperCase(); // Read and convert input to uppercase
        Medicine medicine = Medicine.getMedicineByCode(medicineCode); // Retrieve medicine by code
        if (medicine != null)
        {
            // Display the medicine details
            System.out.println(ColorUtils.SUCCESS_COLOR + "Medicine " + medicine.getCode() + " is available with cost Rs." + medicine.getCost() + ColorUtils.RESET);
        }
        else 
        {
            // Handle invalid medicine code
            System.out.println(ColorUtils.ERROR_COLOR + "Invalid Medicine Code." + ColorUtils.RESET);
        }
    }

    // Displays a list of all medicines with their codes and costs
    void browseMedicines()
    {
        Medicine[] medicines = Medicine.getAllMedicines(); // Retrieve all medicines
        for (Medicine medicine : medicines) 
        {
            // Print each medicine's code and cost
            System.out.println(ColorUtils.INFO_COLOR + medicine.getCode() + " - Medicine " + medicine.getCode() + " \t Rs." + medicine.getCost() + ColorUtils.RESET);
        }
    }

    // Updates the cost of a medicine based on code
    void updateMedicineCost(Scanner sc) 
    {
        System.out.print(ColorUtils.INPUT_COLOR + "Enter Medicine Code (A, B, C): " + ColorUtils.RESET);
        String medicineCode = sc.nextLine().toUpperCase(); // Read and convert input to uppercase
        Medicine medicine = Medicine.getMedicineByCode(medicineCode); // Retrieve medicine by code
        if(medicine != null)
        {
            System.out.print(ColorUtils.INPUT_COLOR + "Enter new cost for Medicine " + medicine.getCode() + ": " + ColorUtils.RESET);
            // Update medicine cost
            medicine.setCost(Integer.parseInt(sc.nextLine())); // Parse cost and update
            System.out.println(ColorUtils.SUCCESS_COLOR + "Medicine " + medicine.getCode() + " cost updated to Rs." + medicine.getCost() + ColorUtils.RESET);
        } 
        else 
        {
            // Handle invalid medicine code
            System.out.println(ColorUtils.ERROR_COLOR + "Invalid Medicine Code." + ColorUtils.RESET);
        }
    }
}