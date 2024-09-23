package com.evergent.corejava.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class PharmacyDBConnection {
    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/pharmacydb", 
            "root", 
            "admin"  
        );
    }
}