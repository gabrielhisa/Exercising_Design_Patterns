package org.example;

import org.example.pizza.*;

// Factory class
public class PizzaFactory {
    public Pizza createPizza(PizzaType type){
        Pizza pizza = null;

        switch (type) {
            case MOZZARELA:
                pizza = new MozzarelaPizza();
                break;
            case MARGUERITA:
                pizza = new MargueritaPizza();
                break;
            case VEGANCHEDDAR:
                pizza = new VeganCheddarPizza();
                break;
            case ALLINMONSTROSITY:
                pizza = new AllInMonstrosityPizza();
                break;
        }

    return pizza;

    }
}
