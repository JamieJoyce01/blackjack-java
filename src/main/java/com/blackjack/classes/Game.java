package com.blackjack.classes;

import com.blackjack.dealer.lib.dealer.Dealer;
import com.blackjack.player.lib.player.Player;
import com.blackjack.table.lib.table.Table;

public class Game {

    public Game(Player player) {
        Table table = new Table();
        Dealer dealer = table.getDealer();
        table.joinPlayer(dealer);
        table.joinPlayer(player);

        dealer.deal(table.getPlayers());

        dealer.hand.getHand().forEach(System.out::println);
        System.out.println("");
        player.hand.getHand().forEach(System.out::println);
    }

    public static Game createGameInstance(Player player) {  return new Game(player); };
}
