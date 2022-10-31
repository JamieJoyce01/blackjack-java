package com.blackjack.deck.lib.deck;

import com.blackjack.deck.lib.card.Card;
import com.blackjack.deck.lib.enums.CardValue;
import com.blackjack.deck.lib.enums.Suit;

import java.util.ArrayList;

public class Deck {
    private final Suit[] suitValues = Suit.values();
    private final CardValue[] cardValues = CardValue.values();
    private final ArrayList<Card> deck;


    public Deck() {
        this.deck = fillDeck();
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    private ArrayList<Card> fillDeck() {
        ArrayList<Card> cards = new ArrayList<>();
        for (Suit suit : suitValues) {
            for (CardValue value : cardValues) {
                cards.add(new Card(suit, value));
            }
        }
        return cards;
    }

    public static Deck createDeck() {
        return new Deck();
    }
}
