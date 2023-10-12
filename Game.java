package com.priyanshu.SnakeGame;
import java.util.*;

public class Game{
    
    private int winPoint;

    //aggregation
    private List<Player> playersList;
    private SnakeLadderBoard gameBoard;
    private Dice dice;

    Game(List<Player> playerList, SnakeLadderBoard gameBoard){
        this.playersList = playerList;
        this.gameBoard = gameBoard;
        dice = new Dice();
        winPoint = 100;
    }

    public void start(){

        System.out.println("Game Started !!");

        boolean flag = true;

        while(flag){

            for(Player player : playersList){

                //rolling dice
                int value = dice.diceRoll();

                //checking new position of player after dice throw
                int newPosition = this.playerNewPosition(player, value);

                //updating position of players after rolling dice
                player.setPosition(newPosition);
                System.out.println(player.getPosition() + " " + winPoint);
                //checking if any player has reached the wining point
                if(this.hasWon(player)){
                    flag = false;
                    break;
                }

            }

        }
        
        System.out.println("Game Finished !!");
        
    }

    public boolean hasWon(Player player){
        if(player.getPosition() == winPoint){
            System.out.println(player.getName() + " has Won the Game !!");
            return true;
        }

        return false;
    }

    public int playerNewPosition(Player player, int diceValue){
        
        int newPosition = player.getPosition() + diceValue;

        if(newPosition > winPoint){
            System.out.println("Invalid Throw");
            return player.getPosition(); 
        }

        else if(gameBoard.checkComponent(newPosition)!=0){
            return gameBoard.checkComponent(newPosition);
        }

        return newPosition;
    }
    
}
