package org.example;

import org.example.board.RandomState;

import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        /*

        RandomState randomState = new RandomState();

        randomState.createBoard(10,10);
        randomState.printBoard();

         */

        Random random = new Random();

        for (int i = 0; i < 10; i++){
            double lol = random.nextDouble(1) * 100;
            int yey = Integer.valueOf((int) lol);
            System.out.println(lol);
            System.out.println(yey);
        }



    }
}