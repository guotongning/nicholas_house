package com.ning.nicholas_house.worker;

import com.ning.nicholas_house.entity.Poker;
import com.ning.nicholas_house.entity.TexasPokerPlayer;
import com.ning.nicholas_house.enums.PokerPool;

import java.util.*;

/**
 * @author 不在能知，乃在能行 ——nicholas
 * @description 发牌器
 * @date 2020/9/27 17:14
 */
public class TexasDealer {
    private List<Poker> pokers;

    /**
     * 牌池初始化
     */
    public TexasDealer() {
        ArrayList<Poker> pokers = new ArrayList<>(Arrays.asList(PokerPool.TEXAS.getPokers()));
        Collections.shuffle(pokers);
        Collections.shuffle(pokers);
        Collections.shuffle(pokers);
        this.pokers = pokers;
    }

    /**
     * 从池中获取一张牌
     *
     * @return
     */
    public Poker popFromPool() {
        Poker poker = remAndGet();
        checkGetOne(poker);
        return poker;
    }

    /**
     * 从牌堆顶部拿一张牌
     *
     * @return
     */
    public synchronized Poker remAndGet() {
        return this.pokers.remove(0);
    }

    /**
     * 发手牌
     */
    public void LicensingHands(TexasPokerPlayer[] pokerPlayers) {
        if (pokerPlayers.length > 0) {
            for (TexasPokerPlayer pokerPlayer : pokerPlayers) {
                if (pokerPlayer != null) {
                    Poker[] pokers = new Poker[2];
                    pokers[0] = remAndGet();
                    pokers[1] = remAndGet();
                    checkGetHands(pokers);
                    pokerPlayer.setHands(pokers);
                }
            }
        }
    }

    /**
     * 翻牌
     */
    public Poker[] Flop() {
        Poker[] flop = new Poker[3];
        flop[0] = remAndGet();
        flop[1] = remAndGet();
        flop[2] = remAndGet();
        checkGetHands(flop);
        return flop;
    }

    /**
     * 检测、补偿
     *
     * @return
     */
    private boolean checkGetOne(Poker poker) {
        if (poker == null) {
            poker = remAndGet();
            while (poker == null) {
                poker = remAndGet();
            }
        }
        return true;
    }

    /**
     * 检测、补偿
     *
     * @param pokers
     * @return
     */
    private boolean checkGetHands(Poker[] pokers) {
        for (Poker poker : pokers) {
            if (poker == null) {
                poker = remAndGet();
                while (poker == null) {
                    poker = remAndGet();
                }
            }
        }
        return true;
    }
}
