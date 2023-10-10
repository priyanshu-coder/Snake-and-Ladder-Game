package com.priyanshu.SnakeGame;
import java.util.*;

public class SnakeLadderBoard{

    List<Integer> grid;
    int winPoint;


    public SnakeLadderBoard(int winPoint, int size){
        grid = new ArrayList<Integer>(size + 1);
        this.winPoint = winPoint;

    }
}