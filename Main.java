package com.priyanshu.SnakeGame;

import java.util.*;


class Main{

    public static void main(String[] args) {

        // initializing board with size and wining point
        SnakeLadderBoard board = new SnakeLadderBoard(100);

        // list of players participating in the game
        List<Player> players = new ArrayList<Player>();

        Scanner scanner = new Scanner(System.in);
        int totalPlayers = scanner.nextInt();

        // flushing "\n" at the end of first input
        scanner.nextLine();    

        for(int i = 0 ; i < totalPlayers ; i++){
            String name = scanner.nextLine();
            players.add(new Player(name));
        }

        //initializing snake and ladder positions in the game

        int[] snakeStartPosition = {50,70,80,95};
        int[] snakeEndPosition =   {10,20,30,40};

        int[] ladderStartPosition = {5,25,35,45};
        int[] ladderEndPosition =   {55,65,75,85};


        for(int i=0;i<snakeStartPosition.length;i++){
            board.initializeComponent(snakeStartPosition[i],snakeEndPosition[i]);
            board.initializeComponent(ladderStartPosition[i], ladderEndPosition[i]);
        }


        //creating instance of game

        Game game = new Game(players,board);
        game.start();

        scanner.close();
    }
}