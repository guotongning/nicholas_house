package com.ning.nicholas_house.worker;

import com.ning.nicholas_house.entity.Poker;
import com.ning.nicholas_house.entity.TexasPokerPlayer;
import com.ning.nicholas_house.enums.PokerPool;

import java.util.Arrays;
import java.util.List;

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
        this.pokers = Arrays.asList(PokerPool.TEXAS.getPokers());
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
    private synchronized Poker remAndGet() {
        Poker poker = this.pokers.get(0);
        boolean remove = this.pokers.remove(poker);
        if (remove) {
            return poker;
        }
        return null;
    }

    /**
     * 发牌
     */
    public void Licensing(TexasPokerPlayer[] pokerPlayers) {
        if (pokerPlayers.length > 0) {
            for (TexasPokerPlayer pokerPlayer : pokerPlayers) {
                if (pokerPlayer != null) {
                    Poker[] pokers = new Poker[2];
                    pokers[0] = remAndGet();
                    pokers[1] = remAndGet();
                    checkGetHands(pokers);
                    pokerPlayer.setFinalHands(pokers);
                }
            }
        }
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
