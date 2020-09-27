package com.ning.nicholas_house.enums;

import com.ning.nicholas_house.entity.Constants;
import com.ning.nicholas_house.entity.Poker;

public enum PokerPool {
    TEXAS(Constants.texasPokerPool, "德州扑克");
    private Poker[] pokers;
    private String desc;

    PokerPool(Poker[] pokers, String desc) {
        this.pokers = pokers;
        this.desc = desc;
    }

    public Poker[] getPokers() {
        return pokers;
    }

    public void setPokers(Poker[] pokers) {
        this.pokers = pokers;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
