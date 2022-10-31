package com.blackjack.deck.lib.enums;

public enum Suit {
    HEARTS("Hearts"),
    SPADES("Spades"),
    DIAMONDS("Diamonds"),
    CLUBS("Clubs");

    public final String suit;

    Suit(String suit) {
        this.suit = suit;
    }
}