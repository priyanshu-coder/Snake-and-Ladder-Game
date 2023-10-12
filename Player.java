package com.priyanshu.SnakeGame;

public class Player {

    private String name;
    private int position;

    public Player(String name){
        this.name = name;
        this.position = 1;
    }

    public String getName(){
        return this.name;
    }

    public int getPosition(){
        return this.position;
    }

    public void setPosition(int position){
        this.position = position;
        return;
    }
}
