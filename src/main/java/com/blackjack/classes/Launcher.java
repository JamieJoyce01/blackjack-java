package com.blackjack.classes;

import com.blackjack.player.lib.player.Player;

/**
 * Launcher for blackjack game.
 */
public class Launcher {

    /// Where launcher is initialised. Here we would draw the launcher for the user
    /// and launch the game from the UI using launchGame().
    public Launcher() {
        final Game game = launchGame(new Player(10.00f));
    }

    public static Launcher createLauncherInstance() { return new Launcher(); };

    public Game launchGame(Player player) {
        return Game.createGameInstance(player);
    }
}
