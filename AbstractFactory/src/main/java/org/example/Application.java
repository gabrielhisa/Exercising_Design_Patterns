package org.example;

import org.example.archer.Archer;
import org.example.factories.MilitaryFactory;
import org.example.infantry.Infantry;
import org.example.mountedInfantry.MountedInfantry;

public class Application {
    private Infantry infantry;
    private MountedInfantry mountedInfantry;
    private Archer archer;

    public Application (MilitaryFactory quarters){
        infantry = quarters.createInfantry();
        mountedInfantry = quarters.createMountedInfantry();
        archer = quarters.createArcher();
    }

    public void assembleArmy(){
        infantry.equipWeapon();
        infantry.march();
        mountedInfantry.mount();
        archer.equipBow();
    }

}
