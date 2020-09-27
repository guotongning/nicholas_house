package com.ning.nicholas_house.entity;

import com.ning.nicholas_house.enums.TexasStage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author 不在能知，乃在能行 ——nicholas
 * @description 德州扑克游戏桌（6人卓）
 * @date 2020/9/27 16:50
 */
@Data
@ToString
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class TexasPokerTable {
    /**
     * 牌桌上的玩家
     */
    private TexasPokerPlayer[] players = new TexasPokerPlayer[6];
    /**
     * 游戏回合数
     */
    private Integer roundCount;
    /**
     * 翻牌区域
     */
    private Poker[] flop = new Poker[5];
    /**
     * 筹码池
     */
    private ChipPool chipPool;
    /**
     * 游戏当前阶段
     */
    private TexasStage texasStage = TexasStage.准备;
    /**
     * 开桌时间
     */
    private Long startTime;
    /**
     * 结束时间
     */
    private Long endTime;
}
