package org.example.builders;

import org.example.blades.Knife;
import org.example.components.Blade;
import org.example.components.Guard;
import org.example.components.Handle;
import org.example.components.Sheath;

public class KnifeBuilder implements BladeBuilder{
    private Blade blade;
    private Handle handle;
    private Guard guard;
    private Sheath sheath;

    public void setBlade(Blade aBlade){
        this.blade = aBlade;
    }

    @Override
    public void setHandle(Handle aHandle) {
        this.handle = aHandle;
    }

    @Override
    public void setGuard(Guard aGuard) {
        this.guard = aGuard;
    }

    @Override
    public void setSheath(Sheath aSheath) {
        this.sheath = aSheath;
    }

    public Knife getResult(){
        return new Knife(blade, handle, guard, sheath);
    }

    public void getBuildDesc(){
        System.out.println("Assembling knife...");
        System.out.println("Blade size: " + blade.getSize());
        System.out.println("Blade material: " + blade.getMaterial());
        System.out.println("Handle material: " + handle.getMaterial());
        System.out.println("Guard material: " + guard.getMaterial());
        System.out.println("Sheat: " + sheath.getMaterial());
        System.out.println("Knife built. \n\n");
    }


}
