package org.example.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {

    private static final Map<java.lang.Character, CharacterImplementation> charCache = new HashMap<>();

    public static Character getCharacter(char symbol){
        CharacterImplementation character = charCache.get(symbol);

        if (character == null){
            character = new CharacterImplementation(symbol);
            charCache.put(symbol, character);
        }

        return character;
    }
}
