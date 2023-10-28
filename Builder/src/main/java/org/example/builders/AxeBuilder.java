package org.example.builders;

import org.example.blades.Axe;
import org.example.components.Blade;
import org.example.components.Guard;
import org.example.components.Handle;
import org.example.components.Sheath;

public class AxeBuilder implements BladeBuilder{
    private Blade blade;
    private Handle handle;
    private Guard guard;
    private Sheath sheath;


    @Override
    public void setBlade(Blade blade) {
        this.blade = blade;
    }

    @Override
    public void setHandle(Handle handle) {
        this.handle = handle;
    }

    @Override
    public void setGuard(Guard guard) {
        this.guard = guard;
    }

    @Override
    public void setSheath(Sheath sheath) {
        this.sheath = sheath;
    }

    public Axe getResult(){
        return new Axe(blade, handle, guard, sheath);
    }

    public void getBuildDesc(){
        System.out.println("Assembling axe...");
        System.out.println("Blade size: " + blade.getSize());
        System.out.println("Blade material: " + blade.getMaterial());
        System.out.println("Handle material: " + handle.getMaterial());
        System.out.println("Guard material: " + guard.getMaterial());
        System.out.println("Sheat: " + sheath.getMaterial());
        System.out.println("Axe built. \n\n");
    }
}
