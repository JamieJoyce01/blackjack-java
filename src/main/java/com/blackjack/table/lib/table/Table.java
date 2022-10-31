package com.blackjack.table.lib.table;

import com.blackjack.dealer.lib.dealer.Dealer;
import com.blackjack.player.lib.player.Player;

import java.util.ArrayList;
import java.util.HashMap;

public class Table {
    // This array list should be iterated through in reverse, that was the dealer is always last
    // and also the players get dealt from right to left from POV of the screen which would be position
    // arr.length()-1 so reverse is ideal.
    ArrayList<Player> players = new ArrayList<>();
    Dealer tableDealer;

    HashMap<Player, Boolean> playedGo = new HashMap<>();

    public Table() {
        this.tableDealer = new Dealer(this);

    }

    public Dealer getDealer() {
        return tableDealer;
    }

    public void joinPlayer(Player player) {
        this.players.add(player);
        this.playedGo.put(player, false);
    }

    public ArrayList<Player> getPlayers() {
        return this.players;
    }
}
