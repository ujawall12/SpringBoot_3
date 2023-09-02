package com.springboot3.spring_framework;

import com.springboot3.spring_framework._01_game.GameRunner;
import com.springboot3.spring_framework._01_game.SuperContraGame;

public class App01GamingBasicJava {
    public static void main(String[] args) {
//        var _01_game = new MarioGame();
        var game = new SuperContraGame();

        var gameRunner = new GameRunner(game);
        //2: Object Creation + Wiring of Dependencies
        // Game is a Dependency of GameRunner

        gameRunner.run();

    }
}
//