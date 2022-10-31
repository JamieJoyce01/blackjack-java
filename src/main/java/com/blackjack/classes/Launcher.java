package com.blackjack.classes;

/**
 * Launcher for blackjack game.
 */
public class Launcher {

    /// Where launcher is initialised. Here we would draw the launcher for the user
    /// and launch the game from the UI using launchGame().
    public Launcher() {
        final Game game = launchGame();
    }

    public static Launcher createLauncherInstance() { return new Launcher(); };

    public Game launchGame() {
        return Game.createGameInstance();
    }
}
