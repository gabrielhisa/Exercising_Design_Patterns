package org.example.infantry;

public class ItalianInfantry implements Infantry{
    @Override
    public void equipWeapon() {
        System.out.println("Cinquedea equipped.");
    }

    @Override
    public void march() {
        System.out.println("Marciando in avanti!");
    }
}
