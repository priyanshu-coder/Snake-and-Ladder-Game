package com.priyanshu.SnakeGame;
import java.util.*;

public class SnakeLadderBoard extends GameComponent{

    private List<Integer> grid;

    public SnakeLadderBoard(int size){
        grid = new ArrayList<Integer>(size + 1);
    }

    public int getGridSize(){
        return grid.size();
    }

}