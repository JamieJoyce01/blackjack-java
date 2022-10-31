package com.blackjack.deck.testing.lib;

import com.blackjack.deck.lib.deck.Deck;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class deck_test {
    Deck testDeck;
    @BeforeEach
    public void setup() {
        testDeck = new Deck();
    }
    @Test
    @DisplayName("Assert that a new deck has 52 cards in it.")
    void testDeckCreation() {
        assertEquals(testDeck.getCards().size(), 52);
    }

    @Test
    @DisplayName("Assert that taking a card will result in 1 less card in the deck")
    void testTakeCard() {
        testDeck.takeCard();
        assertEquals(testDeck.getCards().size(), 51);
    }

}
