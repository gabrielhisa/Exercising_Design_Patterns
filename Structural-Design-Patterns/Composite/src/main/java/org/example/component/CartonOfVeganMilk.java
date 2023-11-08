package org.example.component;

public class CartonOfVeganMilk implements ProductComponent{

    // Leaf component, or the product itself, there is no object under this one in the tree

    private double price;

    public CartonOfVeganMilk(double price){
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        //System.out.println("Vegan Milk Carton price: " + getPrice());
    }
}
