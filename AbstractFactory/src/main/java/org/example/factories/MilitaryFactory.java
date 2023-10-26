package org.example.factories;

import org.example.archer.Archer;
import org.example.infantry.Infantry;
import org.example.mountedInfantry.MountedInfantry;

public interface MilitaryFactory {
    Infantry createInfantry();
    MountedInfantry createMountedInfantry();
    Archer createArcher();
}
