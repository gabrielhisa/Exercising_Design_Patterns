package org.example.component;

import java.util.ArrayList;
import java.util.List;

public class PalletOfBoxes implements ProductComponent{

    // This is the pallet that has boxes, which have milk cartons

    private List<ProductComponent> boxes = new ArrayList<>();
    int totalBoxes;

    @Override
    public double getPrice() {
        double total = 0;
        for (ProductComponent box : boxes){
            total += box.getPrice();
        }
        return total;
    }

    @Override
    public void print() {
        System.out.println("Number of boxes in the pallet: " + totalBoxes + " || Price per box: " + (getPrice()/totalBoxes));
        System.out.println("Pallet of Boxes price: " + getPrice());
    }

    public void addBox(ProductComponent box) {
        int totalBoxes;
        for (totalBoxes = 0; totalBoxes < 23; totalBoxes++) {
            boxes.add(box);
            totalBoxes++;
        }
        this.totalBoxes = totalBoxes;
    }

    public void removeBox(ProductComponent box) {
        boxes.remove(box);
    }

}
