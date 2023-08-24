package com.springboot3.spring_framework.game;

public class GameRunner {

    GamingConsole game;
    public GameRunner(GamingConsole game) {
        this.game=game;

    }

    public void run() {
        System.out.println("\nInside game "+ game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
//