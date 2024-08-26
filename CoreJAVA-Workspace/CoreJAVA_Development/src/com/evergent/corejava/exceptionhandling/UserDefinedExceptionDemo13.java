package com.evergent.corejava.exceptionhandling;

public class UserDefinedExceptionDemo13 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};

        try {
            System.out.println("Accessing element at index 10: " + num[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Printing stack trace for detailed error information
            System.out.println("Caught an ArrayIndexOutOfBoundsException");
            e.printStackTrace();
        }

        System.out.println("Program continues after handling exception");
    }
}