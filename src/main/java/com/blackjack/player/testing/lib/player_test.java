package com.blackjack.player.testing.lib;

import com.blackjack.player.lib.player.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class player_test {
    Player player;
    @BeforeEach
    public void setup() {
        player = new Player(999);
    }

    @Test
    @DisplayName("Assert that Player.getBalance returns the correct balance of the player")
    void testGetBalance() {
        assertEquals(player.getBalance(), 999);
    }
}
