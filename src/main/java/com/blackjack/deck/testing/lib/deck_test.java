package com.blackjack.deck.testing.lib;

import com.blackjack.deck.lib.deck.Deck;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class deck_test {

//    @BeforeAll


    @Test
    @DisplayName("Assert that a new deck has 52 cards in it.")
    void testDeckCreation() {
        Deck testDeck = Deck.createDeck();
        assertEquals(testDeck.getDeck().size(), 52);
    }

}
