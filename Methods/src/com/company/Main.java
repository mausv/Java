package com.company;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

        String name = "Mauricio";
        int score = 1500;

        int position = calculateHighScorePosition(score);
        displayHighScorePosition(name, position);

        name = "Mariana";
        score = 900;

        position = calculateHighScorePosition(score);
        displayHighScorePosition(name, position);

        name = "Diego";
        score = 400;

        position = calculateHighScorePosition(score);
        displayHighScorePosition(name, position);

        name = "Andrea";
        score = 50;

        position = calculateHighScorePosition(score);
        displayHighScorePosition(name, position);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;

    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into the position: " + position);
    }

    public static int calculateHighScorePosition(int playerScore) {
        if(playerScore > 1000) {
            return 1;
        } else if (playerScore > 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore > 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }

}
