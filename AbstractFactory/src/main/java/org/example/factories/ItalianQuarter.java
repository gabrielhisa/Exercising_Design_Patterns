package org.example.factories;

import org.example.archer.Archer;
import org.example.archer.ItalianArcher;
import org.example.infantry.Infantry;
import org.example.infantry.ItalianInfantry;
import org.example.mountedInfantry.ItalianMountedInfantry;
import org.example.mountedInfantry.MountedInfantry;

public class ItalianQuarter implements MilitaryFactory{
    @Override
    public Infantry createInfantry() {
        return new ItalianInfantry();
    }

    @Override
    public MountedInfantry createMountedInfantry() {
        return new ItalianMountedInfantry();
    }

    @Override
    public Archer createArcher() {
        return new ItalianArcher();
    }
}
