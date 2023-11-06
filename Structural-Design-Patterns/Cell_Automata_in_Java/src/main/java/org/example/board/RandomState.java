package org.example.board;

import java.util.ArrayList;
import java.util.Random;

public class RandomState {

    // Creating the board class, responsible for creating the board where the cells will act

    ArrayList<ArrayList> board;

    public void createBoard(int width, int height) {

        ArrayList<ArrayList> createdBoard = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < width; i++) {
            ArrayList<Integer> line = new ArrayList<>();
            for (int n = 0; n < height; n++) {
                line.add(n, random.nextInt(2));
            }
            createdBoard.add(line);
        }
        board = createdBoard;
    }

    public void printBoard(){
        for (ArrayList list : board){
            System.out.println(list);
        }
    }

    public void setPercentage(double percentage){
        Random random = new Random();

        for (int i = 0; i < 10; i++){
            double percent = random.nextDouble(1) * 100;
            int whole = Integer.valueOf((int) percent);

            if (whole > percentage){

            }
            
        }

    }

}
