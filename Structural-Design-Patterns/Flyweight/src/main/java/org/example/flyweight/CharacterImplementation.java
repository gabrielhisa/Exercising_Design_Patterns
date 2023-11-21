package org.example.flyweight;

public class CharacterImplementation implements Character{

    private char symbol; // Intrinsic state (can be shared among multiple instances of the object)

    public CharacterImplementation(char symbol){
        this.symbol = symbol;
    }

    @Override
    public void draw(String font, int size){
        System.out.println("Char: " + symbol + "\nFont: " + font + "\nSize: " + size);
    }


}
