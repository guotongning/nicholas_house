package com.ning.nicholas_house.worker;

import com.ning.nicholas_house.entity.Poker;
import com.ning.nicholas_house.entity.TexasPokerPlayer;
import com.ning.nicholas_house.enums.PokerPool;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HandsJudgmentWorkerTest {


    @Test
    void getFinalHands() {
    }

    @Test
    void straightFlush() {
        TexasPokerPlayer[] texasPokerPlayers = new TexasPokerPlayer[]{new TexasPokerPlayer(), new TexasPokerPlayer(), new TexasPokerPlayer(), new TexasPokerPlayer(), new TexasPokerPlayer(), new TexasPokerPlayer(), new TexasPokerPlayer()};
        TexasDealer texasDealer = new TexasDealer();
        texasDealer.LicensingHands(texasPokerPlayers);
        Poker[] flop = texasDealer.Flop();
        Poker turn = texasDealer.remAndGet();
        Poker river = texasDealer.remAndGet();
        Poker[] publicPoker = new Poker[]{flop[0], flop[1], flop[2], turn, river};
        System.out.println("public:");
        PokerPrinter.printPoker(publicPoker);
        for (TexasPokerPlayer texasPokerPlayer : texasPokerPlayers) {
            Poker[] hands = texasPokerPlayer.getHands();
            System.out.println("hands:");
            PokerPrinter.printPoker(hands);
            HandsJudgmentWorker.straightFlush(hands, publicPoker);
        }

    }
}
