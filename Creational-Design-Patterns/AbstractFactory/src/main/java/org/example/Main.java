package org.example;

import org.example.factories.FrenchQuarter;
import org.example.factories.ItalianQuarter;
import org.example.factories.MilitaryFactory;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static Application configureApp(String nationality){
        Application app;
        MilitaryFactory factory;

        if (nationality.equals("Italian")){
            factory = new ItalianQuarter();
        } else {
            factory = new FrenchQuarter();
        }

        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApp("Italian");
        app.assembleArmy();
    }
}