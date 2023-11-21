package org.example;

import org.example.flyweight.Character;
import org.example.flyweight.CharacterFactory;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Client, manages the extrinsic state (font and size)
        String text = "Hi there.";
        String font = "Alberta";
        int size = 15;

        for (char a : text.toCharArray()){

            // Get flyweight for the char
            Character character = CharacterFactory.getCharacter(a);
            character.draw(font, size);
        }

    }
}