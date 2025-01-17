package com.evergent.corejava.ganesh.application2;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
public class PharmacyManagementSystem 
{
    enum Menu{I, S, E, A}
    enum Inventory{C, B, U, M} 
    enum Sales{T, P, I, S, M} 
    enum MedicineCode{A, B, C} 
    enum MyAccount{V, U, M} 
    static int medicineACost = 10;
    static int medicineBCost = 20;
    static int medicineCCost = 30;
    static int totalCost = 0;
    static int paymentAmount = 0;
    static int additionalCharges = 0;
    static int quantity = 0;
    static String accountName = "Default User";
    static String accountEmail = "user@example.com";
    public static void main(String[] args) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        String userChoice;
        System.out.println("\n\t\t\t*****Welcome To PHARMACY MANAGEMENT SYSTEM*****");
        while(true) 
        {
            displayMainMenu();
            userChoice = sc.nextLine().toUpperCase();
            System.out.println("You selected: " + userChoice);
            try
            {
                Menu choice = Menu.valueOf(userChoice);
                switch (choice)
                {
                    case I:
                        InventoryTab(sc);
                        break;
                    case S:
                        salesTab(sc);
                        break;
                    case A:
                        accountTab(sc);
                        break;
                    case E:
                        System.out.println("Exiting the application. Thank You!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } 
            catch (IllegalArgumentException e)
            {
                System.out.println("Invalid choice. Please try again.");
            }
        }
     }
     static void displayMainMenu() 
     {
        System.out.println("========================");
        System.out.println("| Pharmacy Main Menu   |");
        System.out.println("========================");
        System.out.println("| I - Inventory Tab    |");
        System.out.println("| S - Sales Tab        |");
        System.out.println("| A - Account Tab      |");
        System.out.println("| E - Exit             |");
        System.out.println("========================");
        System.out.print("Enter your Choice (I,S,A,E) : ");
     }
     static void InventoryTab(Scanner sc) 
     {
        String userChoice;
        System.out.println("===========================");
        System.out.println("|       Inventory         |");
        System.out.println("===========================");
        System.out.println("| C - Check Medicine      |");
        System.out.println("| B - Browse Medicines    |");
        System.out.println("| U - Update Medicine     |");
        System.out.println("| M - Return to Main Menu |");
        System.out.println("===========================");
        System.out.print("Enter your Choice (C,B,U,M) : ");
        userChoice = sc.nextLine().toUpperCase();
        try 
        {
            Inventory choice = Inventory.valueOf(userChoice);
            switch (choice) 
            {
                case C:
                    checkMedicine(sc);
                    break;
                case B:
                    browseMedicines();
                    break;
                case U:
                    updateMedicineCost(sc);
                    break;
                case M:
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } 
        catch (IllegalArgumentException e) 
        {
            System.out.println("Invalid choice. Please try again.");
        }
     }
     static void checkMedicine(Scanner sc)
     {
        System.out.print("Enter Medicine Code (A, B, C): ");
        String medicineCode = sc.nextLine().toUpperCase();
        try 
        {
            MedicineCode code = MedicineCode.valueOf(medicineCode);
            switch (code)
            {
                case A:
                    System.out.println("Medicine A is available with cost Rs." + medicineACost);
                    break;
                case B:
                    System.out.println("Medicine B is available with cost Rs." + medicineBCost);
                    break;
                case C:
                    System.out.println("Medicine C is available with cost Rs." + medicineCCost);
                    break;
                default:
                    System.out.println("Invalid Medicine Code.");
            }
        } 
        catch (IllegalArgumentException e)
        {
            System.out.println("Invalid Medicine Code.");
        }
     }
     static void browseMedicines() 
     {
        System.out.println("Available Medicines:");
        System.out.println("A - Medicine A \t Rs." + medicineACost);
        System.out.println("B - Medicine B \t Rs." + medicineBCost);
        System.out.println("C - Medicine C \t Rs." + medicineCCost);
     }
     static void updateMedicineCost(Scanner sc) 
     {
        System.out.print("Enter Medicine Code (A, B, C): ");
        String medicineCode=sc.nextLine().toUpperCase();
        switch(MedicineCode.valueOf(medicineCode))
        {
            case A:
                System.out.print("Enter new cost for Medicine A: ");
                medicineACost = Integer.parseInt(sc.nextLine());
                System.out.println("Medicine A cost updated to Rs." + medicineACost);
                break;
            case B:
                System.out.print("Enter new cost for Medicine B: ");
                medicineBCost = Integer.parseInt(sc.nextLine());
                System.out.println("Medicine B cost updated to Rs." + medicineBCost);
                break;
            case C:
                System.out.print("Enter new cost for Medicine C: ");
                medicineCCost = Integer.parseInt(sc.nextLine());
                System.out.println("Medicine C cost updated to Rs." + medicineCCost);
                break;
            default:
                System.out.println("Invalid Medicine Code.");
        }
     }
     static void salesTab(Scanner sc) 
     {
        String userChoice;
        boolean continueSales=true;
        while(continueSales) 
        {
            displaySalesMenu();
            userChoice=sc.nextLine().toUpperCase();
            switch(Sales.valueOf(userChoice)) 
            {
                case T:
                    calculateTotalCost(sc);
                    break;
                case P:
                    processPayment(sc);
                    break;
                case I:
                    displayInvoice();
                    break;
                case S:
                    displaySummary();
                    break;
                case M:
                    continueSales=false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
     }
     static void displaySalesMenu()
     {
        System.out.println("==============================");
        System.out.println("|           Sales            |");
        System.out.println("==============================");
        System.out.println("| T - To sell and get bill   |");
        System.out.println("| P - Make Payment           |");
        System.out.println("| I - Display Invoice        |");
        System.out.println("| S - Display Summary        |");
        System.out.println("| M - Return to Main Menu    |");
        System.out.println("==============================");
        System.out.print("Enter your Choice (T,P,I,S,M) : ");
     }
     static void calculateTotalCost(Scanner sc)
     {
        System.out.print("Enter Medicine Code (A, B, C): ");
        String medicineCode = sc.nextLine().toUpperCase();
        int medicineCost = 0;
        switch(MedicineCode.valueOf(medicineCode)) 
        {
            case A:
                medicineCost = medicineACost;
                break;
            case B:
                medicineCost = medicineBCost;
                break;
            case C:
                medicineCost = medicineCCost;
                break;
            default:
                System.out.println("Invalid Medicine Code.");
                return;
        }
        System.out.print("Enter quantity: ");
        quantity = Integer.parseInt(sc.nextLine());
        totalCost = medicineCost * quantity;
        System.out.println("Total cost: Rs." + totalCost);
     }
     static void processPayment(Scanner sc)
     {
        if(totalCost==0)
        {
            System.out.println("Total cost is not calculated yet. Please calculate the total cost first.");
        } 
        else
        {
            String otp = generateOTP();
            System.out.println("Your OTP for payment is: " + otp);
            System.out.print("Enter OTP: ");
            String enteredOtp = sc.nextLine();
            if(otp.equals(enteredOtp)) 
            {
                System.out.print("Enter payment amount: ");
                paymentAmount=Integer.parseInt(sc.nextLine());
                if (paymentAmount>=totalCost) 
                {
                    System.out.println("Payment successful. Change: Rs." + (paymentAmount - totalCost));
                } 
                else 
                {
                    System.out.println("Insufficient payment. Please enter a valid amount.");
                }
            }
            else
            {
                System.out.println("Invalid OTP. Payment failed.");
            }
        }
     }
     static String generateOTP() 
     {
        Random random = new Random();
        int otp = 1000 + random.nextInt(9000);
        return String.valueOf(otp);
     }
     static void displayInvoice() 
     {
        System.out.println("==================================");
        System.out.println("|              Invoice           |");
        System.out.println("==================================");
        System.out.println("Medicine Cost: Rs." + totalCost);
        System.out.println("Additional Charges: Rs." + additionalCharges);
        System.out.println("Total Amount: Rs." + (totalCost + additionalCharges));
        System.out.println("");
     }
     static void displaySummary()
     {
        System.out.println("===================================");
        System.out.println("|             Summary             |");
        System.out.println("===================================");
        System.out.println("Total Cost: Rs." + totalCost);
        System.out.println("Additional Charges: Rs." + additionalCharges);
        System.out.println("Total Amount: Rs." + (totalCost + additionalCharges));
        totalCost = 0;
        System.out.println("Thank You buy again :)");
        System.out.println("");
     }
     static void accountTab(Scanner sc)
     {
        String userChoice;
        System.out.println("===========================");
        System.out.println("|      My Account         |");
        System.out.println("===========================");
        System.out.println("| V - View Account        |");
        System.out.println("| U - Update Account      |");
        System.out.println("| M - Return to Main Menu |");
        System.out.println("===========================");
        System.out.print("Enter your Choice (V,U,M) : ");
        userChoice = sc.nextLine().toUpperCase();
        try 
        {
            MyAccount choice = MyAccount.valueOf(userChoice);

            switch (choice) 
            {
                case V:
                    viewAccountDetails();
                    break;
                case U:
                    updateAccountDetails(sc);
                    break;
                case M:
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } 
        catch (IllegalArgumentException e) 
        {
            System.out.println("Invalid choice. Please try again.");
        }
    }
    static void viewAccountDetails() 
    {
        System.out.println("=================================");
        System.out.println("|          Account Details      |");
        System.out.println("=================================");
        System.out.println("Name: " + accountName);
        System.out.println("Email: " + accountEmail);
    }
    static void updateAccountDetails(Scanner sc) 
    {
        System.out.print("Enter new account name: ");
        accountName = sc.nextLine();
        System.out.print("Enter new account email: ");
        accountEmail = sc.nextLine();
        System.out.println("Account details updated successfully.");
    }
}