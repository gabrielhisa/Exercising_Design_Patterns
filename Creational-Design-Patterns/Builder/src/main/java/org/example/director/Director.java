package org.example.director;

import org.example.builders.BladeBuilder;
import org.example.components.Blade;
import org.example.components.Guard;
import org.example.components.Handle;
import org.example.components.Sheath;

public class Director {

    public void buildBowieKnife(BladeBuilder builder){
        builder.setBlade(new Blade("small", "forged steel"));
        builder.setHandle(new Handle("ironwood"));
        builder.setGuard(new Guard("iron"));
        builder.setSheath(new Sheath("kydex"));
        builder.getBuildDesc();
    }

    public void buildBarbedAxe(BladeBuilder builder){
        builder.setBlade(new Blade("large", "carbon steel"));
        builder.setHandle(new Handle("oak"));
        builder.setGuard(new Guard(""));
        builder.setSheath(new Sheath("leather"));
        builder.getBuildDesc();
    }
}
