package org.example.pizza;

public class MozzarelaPizza implements Pizza{

    @Override
    public void buildPizza() {
        System.out.println("Building pizza with ingredients...");
    }

    @Override
    public void bakePizza() {
        System.out.println("Baking pizza in the oven.");
    }

    @Override
    public void putPizzaInBox() {
        System.out.println("Putting pizza in the box!");
    }
}
