package com.blackjack.classes;

import com.blackjack.deck.lib.deck.Deck;

public class Game {

    public Game() {
        Deck deck = Deck.createDeck();

        System.out.println(deck);
    }

    public static Game createGameInstance() {  return new Game(); };
}
