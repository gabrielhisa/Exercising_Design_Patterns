package org.example.factories;

import org.example.archer.Archer;
import org.example.archer.FrenchArcher;
import org.example.infantry.FrenchInfantry;
import org.example.infantry.Infantry;
import org.example.mountedInfantry.FrenchMountedInfantry;
import org.example.mountedInfantry.MountedInfantry;

public class FrenchQuarter implements MilitaryFactory{
    @Override
    public Infantry createInfantry() {
        return new FrenchInfantry();
    }

    @Override
    public MountedInfantry createMountedInfantry() {
        return new FrenchMountedInfantry();
    }

    @Override
    public Archer createArcher() {
        return new FrenchArcher();
    }
}
