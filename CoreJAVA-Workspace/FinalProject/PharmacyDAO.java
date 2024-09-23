package com.evergent.corejava.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.evergent.corejava.projectbean.*;
public class PharmacyDAO {

    public int addProduct(PharmacyBean product) {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = PharmacyDBConnection.getConnection();
            String query = "INSERT INTO pharmacy_products (product_id, product_name, quantity, price) VALUES (?, ?, ?, ?)";
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, product.getProductId());
            pstmt.setString(2, product.getProductName());
            pstmt.setInt(3, product.getQuantity());
            pstmt.setDouble(4, product.getPrice());
            int updateCount = pstmt.executeUpdate();
            con.close();
            return updateCount;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int updateStock(int productId, int newQuantity) {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = PharmacyDBConnection.getConnection();
            String query = "UPDATE pharmacy_products SET quantity = ? WHERE product_id = ?";
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, newQuantity);
            pstmt.setInt(2, productId);
            int updateCount = pstmt.executeUpdate();
            con.close();
            return updateCount;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int getStock(int productId) {
        Connection con = null;
        PreparedStatement pstmt = null;
        int stock = 0;
        try {
            con = PharmacyDBConnection.getConnection();
            String query = "SELECT quantity FROM pharmacy_products WHERE product_id = ?";
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, productId);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                stock = rs.getInt(1);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stock;
    }

    public void recordTransaction(int productId, int quantity, double totalPrice) {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = PharmacyDBConnection.getConnection();
            String query = "INSERT INTO pharmacy_transactions (product_id, quantity, total_price) VALUES (?, ?, ?)";
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, productId);
            pstmt.setInt(2, quantity);
            pstmt.setDouble(3, totalPrice);
            pstmt.executeUpdate();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getTransactions(int productId) {
        Connection con = null;
        PreparedStatement pstmt = null;
        StringBuilder transactions = new StringBuilder();
        try {
            con = PharmacyDBConnection.getConnection();
            String query = "SELECT * FROM pharmacy_transactions WHERE product_id = ?";
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, productId);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                transactions.append("Transaction ID: ").append(rs.getInt("transaction_id"))
                        .append(", Quantity: ").append(rs.getInt("quantity"))
                        .append(", Total Price: ").append(rs.getDouble("total_price"))
                        .append(", Date: ").append(rs.getTimestamp("transaction_date")).append("\n");
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return transactions.toString();
    }
}