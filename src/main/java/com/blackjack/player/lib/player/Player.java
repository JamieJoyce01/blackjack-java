package com.blackjack.player.lib.player;

import com.blackjack.player.lib.hand.Hand;

public class Player {
    private float balance;
    public Hand hand;

    public Player(float balance) {
        this.balance = balance;
        this.hand = new Hand();
    }

    public float getBalance() { return this.balance; }
}
