package org.example.infantry;

public class FrenchInfantry implements Infantry{
    @Override
    public void equipWeapon() {
        System.out.println("Equip sabre.");
    }

    @Override
    public void march() {
        System.out.println("Avance!");
    }
}
