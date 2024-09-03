package com.evergent.corejava.task.task3;
import java.util.HashSet;
import java.util.Set;

public class PharmacyImpl implements PharmacyInterface {
    Set<Medicine> medicines = null;

    public PharmacyImpl() {
        medicines = new HashSet<>();
    }

    @Override
    public String addMedicine(Medicine m) {
        medicines.add(m);
        return m.getId();
    }

    @Override
    public void searchById(String id) {
        boolean found = false;
        if (medicines.size() > 0 && medicines != null) {
            for (Medicine medicine : medicines) {
                if (medicine.getId().equals(id)) {
                    System.out.println(medicine.getId() + " " + medicine.getName() + " " + medicine.getManufacturer());
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("Medicine Not Found");
        }
    }

    @Override
    public void getAllMedicines() {
        if (medicines.size() > 0) {
            for (Medicine medicine : medicines) {
                System.out.println(medicine.getId() + " " + medicine.getName() + " " + medicine.getManufacturer());
            }
        } else {
            System.out.println("No Medicines are available");
        }
    }
}