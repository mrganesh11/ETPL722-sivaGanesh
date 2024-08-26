package com.evergent.corejava.ganesh.application4;

import java.util.Random;
import java.util.Scanner;

// Class for handling sales-related operations
public class SalesTab extends BaseTab {

    // Implementation of the abstract method from BaseTab
    protected void printHeader(String title) {
        System.out.println(ColorUtils.HEADER_COLOR + "===========================" + ColorUtils.RESET);
        System.out.println(ColorUtils.HEADER_COLOR + "       " + title + "         " + ColorUtils.RESET);
        System.out.println(ColorUtils.HEADER_COLOR + "===========================" + ColorUtils.RESET);
    }

    // Instance variables for managing sales data
    private int totalCost = 0;
    private int paymentAmount = 0;
    private int additionalCharges = 0;
    private int quantity = 0;
    private int discountPercentage = 0;
    private String couponCode = "";

    // Displays the menu options for the Sales tab
    public void displayMenu() {
        printHeader("Sales");
        System.out.println(ColorUtils.INFO_COLOR + "| T - To sell and get bill|" + ColorUtils.RESET);
        System.out.println(ColorUtils.INFO_COLOR + "| P - Make Payment        |" + ColorUtils.RESET);
        System.out.println(ColorUtils.INFO_COLOR + "| I - Display Invoice     |" + ColorUtils.RESET);
        System.out.println(ColorUtils.INFO_COLOR + "| S - Display Summary     |" + ColorUtils.RESET);
        System.out.println(ColorUtils.INFO_COLOR + "| C - Apply Coupon        |" + ColorUtils.RESET);
        System.out.println(ColorUtils.INFO_COLOR + "| M - Return to Main Menu |" + ColorUtils.RESET);
        System.out.println(ColorUtils.INFO_COLOR + "===========================" + ColorUtils.RESET);
        System.out.print(ColorUtils.INPUT_COLOR + "Enter your Choice (T,P,I,S,C,M) : " + ColorUtils.RESET);
    }

    // Handles user choices for sales operations
    public void handleChoice(String choice, Scanner sc) {
        switch (choice) {
            case "T":
                calculateTotalCost(sc);
                break;
            case "P":
                processPayment(sc);
                break;
            case "I":
                displayInvoice();
                break;
            case "S":
                displaySummary();
                break;
            case "C":
                applyCoupon(sc);
                break;
            case "M":
                break; // Return to Main Menu, no action needed
            default:
                System.out.println(ColorUtils.ERROR_COLOR + "Invalid choice. Please try again." + ColorUtils.RESET);
        }
    }

    // Calculates the total cost based on medicine and quantity
    private void calculateTotalCost(Scanner sc) {
        System.out.print(ColorUtils.INPUT_COLOR + "Enter Medicine Code (A, B, C): " + ColorUtils.RESET);
        String medicineCode = sc.nextLine().toUpperCase();
        Medicine medicine = Medicine.getMedicineByCode(medicineCode);
        if (medicine != null) {
            System.out.print(ColorUtils.INPUT_COLOR + "Enter quantity: " + ColorUtils.RESET);
            quantity = Integer.parseInt(sc.nextLine());
            totalCost = medicine.getCost() * quantity;
            applyDiscount();  // Apply any discount if applicable
            System.out.println(ColorUtils.SUCCESS_COLOR + "Total cost after discount: Rs." + totalCost + ColorUtils.RESET);
        } else {
            System.out.println(ColorUtils.ERROR_COLOR + "Invalid Medicine Code." + ColorUtils.RESET);
        }
    }

    // Processes the payment based on user input and generates an OTP for validation
    private void processPayment(Scanner sc) {
        if (totalCost == 0) {
            System.out.println(ColorUtils.ERROR_COLOR + "Total cost is not calculated yet. Please calculate the total cost first." + ColorUtils.RESET);
        } else {
            String otp = generateOTP();
            System.out.println(ColorUtils.SUCCESS_COLOR + "Your OTP for payment is: " + otp + ColorUtils.RESET);
            System.out.print(ColorUtils.INPUT_COLOR + "Enter OTP: " + ColorUtils.RESET);
            String enteredOtp = sc.nextLine();
            if (otp.equals(enteredOtp)) {
                System.out.print(ColorUtils.INPUT_COLOR + "Enter payment amount: " + ColorUtils.RESET);
                paymentAmount = Integer.parseInt(sc.nextLine());
                if (paymentAmount >= totalCost) {
                    System.out.println(ColorUtils.SUCCESS_COLOR + "Payment successful. Change: Rs." + (paymentAmount - totalCost) + ColorUtils.RESET);
                } else {
                    System.out.println(ColorUtils.ERROR_COLOR + "Insufficient payment. Please enter a valid amount." + ColorUtils.RESET);
                }
            } else {
                System.out.println(ColorUtils.ERROR_COLOR + "Invalid OTP. Payment failed." + ColorUtils.RESET);
            }
        }
    }

    // Generates a random OTP for payment validation
    private String generateOTP() {
        Random random = new Random();
        int otp = 1000 + random.nextInt(9000);
        return String.valueOf(otp);
    }

    // Applies a discount based on the percentage
    private void applyDiscount() {
        if (discountPercentage > 0) {
            double discountAmount = totalCost * discountPercentage / 100.0;
            totalCost -= discountAmount;
            System.out.println(ColorUtils.SUCCESS_COLOR + "Discount applied: Rs." + discountAmount + ColorUtils.RESET);
        }
    }

    // Applies a coupon code to get a discount
    private void applyCoupon(Scanner sc) {
        System.out.print(ColorUtils.INPUT_COLOR + "Enter coupon code: " + ColorUtils.RESET);
        String enteredCoupon = sc.nextLine();
        if (isValidCoupon(enteredCoupon)) {
            System.out.print(ColorUtils.INPUT_COLOR + "Enter discount percentage: " + ColorUtils.RESET);
            discountPercentage = Integer.parseInt(sc.nextLine());
            System.out.println(ColorUtils.SUCCESS_COLOR + "Coupon applied. Discount: " + discountPercentage + "%" + ColorUtils.RESET);
            applyDiscount(); // Apply discount after coupon is applied
        } else {
            System.out.println(ColorUtils.ERROR_COLOR + "Invalid coupon code." + ColorUtils.RESET);
        }
    }

    // Checks if the entered coupon code is valid
    private boolean isValidCoupon(String coupon) {
        // Example coupon validation logic
        return coupon.equals("DISCOUNT10") || coupon.equals("SAVE20");
    }

    // Displays the invoice including cost, additional charges, and discounts
    private void displayInvoice() {
        System.out.println(ColorUtils.INFO_COLOR + "==================================" + ColorUtils.RESET);
        System.out.println(ColorUtils.INFO_COLOR + "|              Invoice           |" + ColorUtils.RESET);
        System.out.println(ColorUtils.INFO_COLOR + "==================================" + ColorUtils.RESET);
        System.out.println("Medicine Cost: Rs." + totalCost);
        System.out.println("Additional Charges: Rs." + additionalCharges);
        System.out.println("Discount: " + discountPercentage + "%");
        System.out.println("Total Amount: Rs." + (totalCost + additionalCharges));
        System.out.println("");
    }

    // Displays the summary of the sales transaction and resets values
    private void displaySummary() {
        System.out.println(ColorUtils.INFO_COLOR + "===================================" + ColorUtils.RESET);
        System.out.println(ColorUtils.INFO_COLOR + "|             Summary             |" + ColorUtils.RESET);
        System.out.println(ColorUtils.INFO_COLOR + "===================================" + ColorUtils.RESET);
        System.out.println("Total Cost: Rs." + totalCost);
        System.out.println("Additional Charges: Rs." + additionalCharges);
        System.out.println("Discount: " + discountPercentage + "%");
        System.out.println("Total Amount: Rs." + (totalCost + additionalCharges));
        totalCost = 0; // Reset total cost after displaying summary
        discountPercentage = 0; // Reset discount percentage
        System.out.println(ColorUtils.SUCCESS_COLOR + "Thank You! Buy again :)" + ColorUtils.RESET);
        System.out.println("");
    }
}