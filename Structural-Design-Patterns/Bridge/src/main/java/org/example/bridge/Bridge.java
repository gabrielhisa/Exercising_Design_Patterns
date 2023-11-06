package org.example.bridge;

import org.example.color.Color;
import org.example.shape.Shape;

public class Bridge implements Shape {
    private Color color;
    private String shape;


    public Bridge(Color color, String shape){
        this.color = color;
        this.shape = shape;
    }
    @Override
    public void draw() {
        System.out.println("Drawing a " + color.fill() + " " + shape + ".");
    }
}
