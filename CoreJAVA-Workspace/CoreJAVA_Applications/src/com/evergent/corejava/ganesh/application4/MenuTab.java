package com.evergent.corejava.ganesh.application4;

import java.util.Scanner;

// Interface representing a tab in the application
interface MenuTab 
{
    // Method to display the menu options of the tab
    public void displayMenu();
    
    // Method to handle user choices within the tab
    public void handleChoice(String choice, Scanner sc);
}