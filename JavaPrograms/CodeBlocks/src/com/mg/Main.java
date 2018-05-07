package com.mg;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus  = 100;

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("your final score was = " + finalScore);

        }

        




    }
}
