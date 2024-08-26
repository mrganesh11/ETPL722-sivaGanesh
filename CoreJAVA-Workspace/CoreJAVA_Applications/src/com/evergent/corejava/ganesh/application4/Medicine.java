package com.evergent.corejava.ganesh.application4;

// Medicine class representing a medicine item
class Medicine
{
    // Private fields to store the medicine's code and cost
    private String code;
    private int cost;

    // Static array of predefined medicines
    private static final Medicine[] MEDICINES = 
    {
        new Medicine("A", 10),
        new Medicine("B", 20),
        new Medicine("C", 30)
    };

    // Constructor to initialize a Medicine object with a code and cost
    Medicine(String code, int cost)
    {
        this.code = code;
        this.cost = cost;
    }

    // Getter method for the medicine's code
    public String getCode() 
    {
        return code;
    }

    // Getter method for the medicine's cost
    public int getCost() 
    {
        return cost;
    }

    // Setter method to update the medicine's cost
    public void setCost(int cost) 
    {
        this.cost = cost;
    }

    // Static method to retrieve a Medicine object by its code
    public static Medicine getMedicineByCode(String code) 
    {
        // Iterate through the array of medicines
        for (Medicine medicine : MEDICINES) 
        {
            // Check if the medicine code matches the given code
            if (medicine.getCode().equals(code)) 
            {
                // Return the matching medicine
                return medicine;
            }
        }
        // Return null if no medicine matches the given code
        return null;
    }

    // Static method to get all predefined medicines
    public static Medicine[] getAllMedicines() 
    {
        return MEDICINES;
    }
}