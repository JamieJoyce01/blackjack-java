package com.blackjack.classes;

import com.blackjack.dealer.lib.dealer.Dealer;
import com.blackjack.deck.lib.deck.Deck;
import com.blackjack.player.lib.player.Player;

public class Game {

    public Game(Player player) {
        Dealer dealer = Dealer.createDealer();

        dealer.deck.getDeck().forEach(System.out::println);
    }

    public static Game createGameInstance(Player player) {  return new Game(player); };
}
