package org.example;

import org.example.component.BoxOfCartons;
import org.example.component.CartonOfVeganMilk;
import org.example.component.PalletOfBoxes;
import org.example.component.ProductComponent;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Creating cartons
        ProductComponent veganMilkCarton = new CartonOfVeganMilk(3.99);
        ProductComponent chocolateVeganMilkCarton = new CartonOfVeganMilk(4.75);

        // Creating a box of cartons (composite) and add the cartons
        BoxOfCartons boxOfVeganMilk = new BoxOfCartons();
        boxOfVeganMilk.addCarton(veganMilkCarton);

        BoxOfCartons boxOfChocolateVeganMilk = new BoxOfCartons();
        boxOfChocolateVeganMilk.addCarton(chocolateVeganMilkCarton);

        // Creating a pallet (another composite) to add the boxes
        PalletOfBoxes pallet1 = new PalletOfBoxes();
        PalletOfBoxes pallet2 = new PalletOfBoxes();

        pallet1.addBox(boxOfVeganMilk);
        pallet2.addBox(boxOfChocolateVeganMilk);

        boxOfVeganMilk.print();
        pallet1.print();
        System.out.println("-----------");
        boxOfChocolateVeganMilk.print();
        pallet2.print();



    }
}