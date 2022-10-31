package com.blackjack.deck.lib.card;

import com.blackjack.deck.lib.enums.CardValue;
import com.blackjack.deck.lib.enums.Suit;

public record Card(Suit suit, CardValue value) {
}
