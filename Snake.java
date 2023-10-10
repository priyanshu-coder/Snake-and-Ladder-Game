package com.priyanshu.SnakeGame;

import java.util.HashMap;
import java.util.Map;

class Snake implements GameComponent{

    private Map<Integer,Integer> snake;

    Snake(){
        snake = new HashMap<Integer,Integer>();
    }

    @Override
    public void initializeComponent(Integer source, Integer destination) {
        snake.put(source,destination);
        return;
    }

    @Override
    public Integer checkComponent(Integer position) {
        int snakeResponse = 0;
        if(snake.containsKey(position)){
            snakeResponse = snake.get(position);
        }
        return -1*snakeResponse;
    }
  
}