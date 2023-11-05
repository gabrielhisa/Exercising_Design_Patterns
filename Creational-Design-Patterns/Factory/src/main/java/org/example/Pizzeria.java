package org.example;

import org.example.pizza.Pizza;
import org.example.pizza.PizzaType;

public class Pizzeria {

    private final PizzaFactory pizzaFactory;

    public Pizzeria(PizzaFactory thisPizzaFactory){
        this.pizzaFactory = thisPizzaFactory;
    }

    public Pizza orderPizza(PizzaType type){
        Pizza pizza = pizzaFactory.createPizza(type);
        pizza.buildPizza();
        pizza.bakePizza();
        pizza.putPizzaInBox();

        System.out.println("Here's some " + type + " pizza!");
        return pizza;
    }


}
