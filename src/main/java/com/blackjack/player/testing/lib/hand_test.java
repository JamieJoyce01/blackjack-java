package com.blackjack.player.testing.lib;

import com.blackjack.deck.lib.card.Card;
import com.blackjack.deck.lib.enums.CardValue;
import com.blackjack.deck.lib.enums.Suit;
import com.blackjack.player.lib.hand.Hand;
import org.junit.jupiter.api.*;

public class hand_test {
    Hand hand;
    @BeforeEach
    public void setup() {
        hand = new Hand();
    }
    @Test
    @DisplayName("Assert that a new hand returns an object with an empty ArrayList")
    void testHandCreation() {
        assert(hand.getHand().isEmpty());
    }

    @Test
    @DisplayName("Assert that adding a card to your hand will contain that card in your hand")
    void testAddCard() {
        Card testCard = new Card(Suit.CLUBS, CardValue.ACE);
        assert(!hand.getHand().contains(testCard));
        hand.addCard(testCard);
        assert(hand.getHand().contains(testCard));
    }

}
