
package com.priyanshu.SnakeGame;
import java.util.*;

public class Game{
    
    //aggregation
    List<Player> playersList;
    SnakeLadderBoard gameBoard;
    Dice dice;
    GameComponent snake;
    GameComponent ladder;

    Game(List<Player> playerList, SnakeLadderBoard gameBoard, GameComponent snake, GameComponent ladder){
        this.playersList = playerList;
        this.gameBoard = gameBoard;
        dice = new Dice();
        this.snake = snake;
        this.ladder = ladder;
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
                player.position = newPosition;

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
        if(player.position == gameBoard.winPoint){
            System.out.println(player.name + " has Won the Game !!");
            return true;
        }

        return false;
    }

    public int playerNewPosition(Player player, int diceValue){
        
        int newPosition = player.position + diceValue;

        if(newPosition > gameBoard.winPoint){
            System.out.println("Invalid Throw");
            return player.position; 
        }

        else if(snake.checkComponent(newPosition)!=0){
            System.out.println("Snake Attack");
            return newPosition+snake.checkComponent(newPosition);
        }

        else if(ladder.checkComponent(newPosition)!=0){
            System.out.println("Found Ladder");
            return newPosition+ladder.checkComponent(newPosition);
        }

        return newPosition;
    }
    
}
