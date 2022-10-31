package com.blackjack.player.lib.hand;

import com.blackjack.deck.lib.card.Card;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> hand = new ArrayList<>();

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void addCard(Card card) {
        hand.add(card);
    }
}
