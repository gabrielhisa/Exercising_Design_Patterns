package org.example;

import org.example.bridge.Bridge;
import org.example.color.Color;
import org.example.color.Green;
import org.example.color.Red;
import org.example.shape.Shape;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Color green = new Green();
        Color red = new Red();

        Shape greenTriangle = new Bridge(green, "triangle");
        Shape redOctogon = new Bridge(red, "octogon");

        greenTriangle.draw();;
        redOctogon.draw();

    }
}