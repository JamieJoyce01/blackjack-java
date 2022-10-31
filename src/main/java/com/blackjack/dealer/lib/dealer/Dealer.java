package com.blackjack.dealer.lib.dealer;

import com.blackjack.deck.lib.card.Card;
import com.blackjack.deck.lib.deck.Deck;
import com.blackjack.player.lib.player.Player;
import com.blackjack.table.lib.table.Table;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;

public class Dealer extends Player {
    private Deck deck;
    private Table table;
    public Dealer(Table table) {
        super(0);
        this.table = table;
        this.deck = new Deck();

        shuffleCards(deck.getCards());
    }

    public void deal(ArrayList<Player> players) {
        for (int i = 0; i < 2; i++) {
            Collections.reverse(players);
            for (Player player : players) {
                player.hand.addCard(deck.takeCard());
            }
        }
    }

    public void hit(Player player) {
        player.hand.addCard(deck.takeCard());
    }
    public void shuffleCards(ArrayList<Card> cards) {
        // Using SecureRandom as this is the next best thing from having
        // a hardware RNG.
        SecureRandom random = new SecureRandom();
        Collections.shuffle(cards, random);
    }
}
