package com.priyanshu.SnakeGame;

import java.util.HashMap;
import java.util.Map;

class GameComponent{

    // gamecomponent are snake and ladder
    private Map<Integer,Integer> snakeLadderComponent;

    GameComponent(){
        snakeLadderComponent = new HashMap<Integer,Integer>();
    }

 
    public void initializeComponent(Integer source, Integer destination) {
        snakeLadderComponent.put(source,destination);
        return;
    }


    public Integer checkComponent(Integer position) {
        int componentResponse = 0;
        if(snakeLadderComponent.containsKey(position)){
            componentResponse = snakeLadderComponent.get(position);
        }
        return componentResponse;
    }
  
}