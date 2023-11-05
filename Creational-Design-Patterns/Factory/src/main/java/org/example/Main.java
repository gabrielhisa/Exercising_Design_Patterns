package org.example;

// Exercising the Factory creational pattern with a simple pizzeria example (brazilian pizzeria and the OG italian pizzeria)

import org.example.pizza.PizzaType;

public class Main {
    public static void main(String[] args) {
        //Pizzeria test = new Pizzeria(one);
        PizzaFactory factoryTest = new PizzaFactory();
        Pizzeria pizzeriaTest = new Pizzeria(factoryTest);

        pizzeriaTest.orderPizza(PizzaType.MOZZARELA);
    }
}