package com.evergent.corejava.service;

import com.evergent.corejava.projectbean.*;
import com.evergent.corejava.dao.*;

public class PharmacyService {
    PharmacyDAO pharmacyDAO = new PharmacyDAO();

    public void addProduct(int productId, String productName, int quantity, double price) {
        PharmacyBean product = new PharmacyBean();
        product.setProductId(productId);
        product.setProductName(productName);
        product.setQuantity(quantity);
        product.setPrice(price);
        int result = pharmacyDAO.addProduct(product);
        if (result > 0) {
            System.out.println("Product added successfully.");
        } else {
            System.out.println("Failed to add product.");
        }
    }

    public int checkStock(int productId) {
        return pharmacyDAO.getStock(productId);
    }

    public void purchaseProduct(int productId, int quantity) {
        int currentStock = pharmacyDAO.getStock(productId);
        if (quantity > currentStock) {
            System.out.println("Not enough stock to purchase.");
        } else {
            pharmacyDAO.updateStock(productId, currentStock - quantity);
            double totalPrice = pharmacyDAO.getStock(productId) * quantity;
            pharmacyDAO.recordTransaction(productId, quantity, totalPrice);
            System.out.println("Product purchased successfully.");
        }
    }

    public String viewTransactions(int productId) {
        return pharmacyDAO.getTransactions(productId);
    }
}