package com.priyanshu.SnakeGame;

public class Dice{

    public int diceRoll(){
        int value1 = (int)(Math.random()*6 + 1);      //first dice
        int value2 = (int)(Math.random()*6 + 1);      //second dice

        return value1 + value2;
    }
}