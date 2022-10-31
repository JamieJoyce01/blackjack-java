package com.blackjack.deck.lib.enums;

/// Remember ACE is both 1 and 11 depending on cards in the hand.
public enum CardValue {
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    QUEEN(10),
    KING(10),
    ACE(11);

    public final int value;
    CardValue(int value) {
        this.value = value;
    }
}
