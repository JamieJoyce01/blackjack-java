package com.blackjack.dealer.lib.dealer;

import com.blackjack.deck.lib.card.Card;
import com.blackjack.deck.lib.deck.Deck;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;

public class Dealer {
    public Deck deck;
    public Dealer() {
        this.deck = Deck.createDeck();
        //shuffleCards(deck.getDeck());
    }
    public void shuffleCards(ArrayList<Card> cards) {
        // Using SecureRandom as this is the next best thing from having
        // a hardware RNG.
        SecureRandom random = new SecureRandom();
        Collections.shuffle(cards, random);
    }

    public static Dealer createDealer() { return new Dealer(); }
}
