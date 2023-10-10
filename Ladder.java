package com.priyanshu.SnakeGame;
import java.util.HashMap;

import java.util.Map;

class Ladder implements GameComponent{
        
    private Map<Integer, Integer> ladder; 

    Ladder(){
        ladder = new HashMap<Integer,Integer>();
    }

    @Override
    public void initializeComponent(Integer source, Integer destination) {
        ladder.put(source,destination);
        return;
    }

    @Override
    public Integer checkComponent(Integer position) {
      int ladderResponse = 0;
        if(ladder.containsKey(position)){
            ladderResponse = ladder.get(position);
        }
        return ladderResponse;
    }
}