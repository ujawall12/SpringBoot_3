package com.springboot3.spring_framework;

import com.springboot3.spring_framework.game.GameRunner;
import com.springboot3.spring_framework.game.MarioGame;
import com.springboot3.spring_framework.game.SuperContraGame;

public class App01GamingBasicJava {
    public static void main(String[] args) {
//        var game = new MarioGame();
        var game = new SuperContraGame();

        var gameRunner = new GameRunner(game);
        //2: Object Creation + Wiring of Dependencies
        // Game is a Dependency of GameRunner

        gameRunner.run();

    }
}
