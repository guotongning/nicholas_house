package com.ning.nicholas_house.enums;

public enum TexasStage {
    准备(1, "开局前准备阶段"),
    发牌(2, "发牌阶段"),
    第一轮下注(3, "翻牌前，第一轮下注阶段。"),
    第二轮下注(4, "转牌前，第二轮下注阶段。"),
    第三轮下注(5, "河牌前，第三轮下注阶段。"),
    第四轮下注(6, "河牌后，第四轮下注阶段。"),
    摊牌(7, "玩家摊牌"),

    ;
    private int index;
    private String desc;

    TexasStage(int index, String desc) {
        this.index = index;
        this.desc = desc;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
