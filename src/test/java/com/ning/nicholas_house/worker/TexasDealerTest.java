package com.ning.nicholas_house.worker;

import com.ning.nicholas_house.entity.Poker;
import com.ning.nicholas_house.entity.TexasPokerPlayer;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class TexasDealerTest {
    @Test
    public void licensing() {
        TexasPokerPlayer[] texasPokerPlayers = new TexasPokerPlayer[]{new TexasPokerPlayer(), new TexasPokerPlayer(), new TexasPokerPlayer(), new TexasPokerPlayer(), new TexasPokerPlayer(), new TexasPokerPlayer(), new TexasPokerPlayer()};
        TexasDealer texasDealer = new TexasDealer();
        texasDealer.LicensingHands(texasPokerPlayers);
        System.out.println("==================");
        for (TexasPokerPlayer texasPokerPlayer : texasPokerPlayers) {
            PokerPrinter.printPoker(texasPokerPlayer.getHands());
        }
        System.out.println("==================");
        Poker[] flop = texasDealer.Flop();
        PokerPrinter.printPoker(flop);
        System.out.println("==================");
        Poker turn = texasDealer.remAndGet();
        PokerPrinter.printPoker(turn);
        System.out.println("==================");
        Poker river = texasDealer.remAndGet();
        PokerPrinter.printPoker(river);
    }

}
