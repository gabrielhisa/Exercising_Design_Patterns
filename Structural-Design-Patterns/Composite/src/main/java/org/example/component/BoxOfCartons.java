package org.example.component;

import java.util.ArrayList;
import java.util.List;

public class BoxOfCartons implements ProductComponent{

    // This is one of the branches in the trees, considered a composite as it has other objects under it, such as the carton of milk

    private List<ProductComponent> cartons = new ArrayList<>();
    int totalCartons;

    @Override
    public double getPrice() {
        double total = 0;
        for (ProductComponent carton : cartons){
            total += carton.getPrice();
        }
        return total;
    }

    @Override
    public void print() {
        System.out.println("Total cartons in the box: " + totalCartons);
    }

    public void addCarton(ProductComponent carton){
        int totalCartons = 0;
        for (totalCartons = 0; totalCartons < 13; totalCartons++) {
            cartons.add(carton);
            totalCartons++;
        }
        this.totalCartons = totalCartons;
    }

    public void removeCarton(ProductComponent carton){
        cartons.remove(carton);
    }
}
