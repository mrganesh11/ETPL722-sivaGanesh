package com.evergent.corejava.controller;

import java.util.Scanner;
import com.evergent.corejava.service.*;

public class PharmacyController {
    public static void main(String[] args) {
        int productId = 0, quantity = 0;
        double price = 0;
        String productName = "";
        int choice = 1;

        Scanner s = new Scanner(System.in);
        PharmacyService pharmacyService = new PharmacyService();

        while (choice != 0) {
        	System.out.println("\t\t\t--------Welcome to Pharmacy management--------");
            System.out.println("1. Add New Product");
            System.out.println("2. Show Product Stock");
            System.out.println("3. Purchase Product");
            System.out.println("4. View Transactions");
            System.out.println("Enter your choice: ");
            int ch = s.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter Product ID:");
                    productId = s.nextInt();
                    System.out.println("Enter Product Name:");
                    productName = s.next();
                    System.out.println("Enter Quantity:");
                    quantity = s.nextInt();
                    System.out.println("Enter Price:");
                    price = s.nextDouble();
                    pharmacyService.addProduct(productId, productName, quantity, price);
                    break;

                case 2:
                    System.out.println("Enter Product ID to view stock:");
                    productId = s.nextInt();
                    System.out.println("Stock available: " + pharmacyService.checkStock(productId));
                    break;

                case 3:
                    System.out.println("Enter Product ID to purchase:");
                    productId = s.nextInt();
                    System.out.println("Enter Quantity to purchase:");
                    quantity = s.nextInt();
                    pharmacyService.purchaseProduct(productId, quantity);
                    break;

                case 4:
                    System.out.println("Enter Product ID to view transactions:");
                    productId = s.nextInt();
                    String transactions = pharmacyService.viewTransactions(productId);
                    System.out.println(transactions);
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
            System.out.println("\nEnter 1 for more operations, 0 to exit: ");
            choice = s.nextInt();
        }
        s.close();
    }
}