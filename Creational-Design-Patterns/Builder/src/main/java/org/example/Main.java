package org.example;

import org.example.blades.Axe;
import org.example.blades.Knife;
import org.example.builders.AxeBuilder;
import org.example.builders.BladeBuilder;
import org.example.builders.KnifeBuilder;
import org.example.director.Director;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Director director = new Director();

        // ---------------------------------------------------------------------
        KnifeBuilder builder = new KnifeBuilder();
        director.buildBowieKnife(builder);

        Knife knife = builder.getResult();

        // ---------------------------------------------------------------------
        AxeBuilder axBuilder = new AxeBuilder();
        director.buildBarbedAxe(axBuilder);

        Axe ax = axBuilder.getResult();
    }
}