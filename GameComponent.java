package com.priyanshu.SnakeGame;

public interface GameComponent{

    public void initializeComponent(Integer source, Integer destination);

    public Integer checkComponent(Integer position);
}