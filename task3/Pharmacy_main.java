package com.evergent.corejava.task.task3;
import java.util.Scanner;

public class Pharmacy_main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PharmacyInterface pharmacy = new PharmacyImpl();
        
        while (true) {
            System.out.println("1. Add Medicine 2. Search by ID 3. Display All 4. Exit");
            int no = sc.nextInt();
            switch (no) {
                case 1:
                    System.out.println("Enter the ID");
                    String id = sc.next();
                    System.out.println("Enter the Medicine name");
                    String name = sc.next();
                    System.out.println("Enter Manufacturer name");
                    String manufacturer = sc.next();
                    Medicine m = new Medicine();
                    m.setId(id);
                    m.setName(name);
                    m.setManufacturer(manufacturer);
                    String msg = pharmacy.addMedicine(m);
                    System.out.println("Medicine added with ID: " + msg);
                    break;
                case 2:
                    System.out.println("Enter the ID");
                    String id1 = sc.next();
                    pharmacy.searchById(id1);
                    break;
                case 3:
                    pharmacy.getAllMedicines();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}