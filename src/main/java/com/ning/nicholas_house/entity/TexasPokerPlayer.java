package com.ning.nicholas_house.entity;

import com.ning.nicholas_house.enums.TexasGameType;
import com.ning.nicholas_house.enums.TexasIdentity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author 不在能知，乃在能行 ——nicholas
 * @description 德州扑克 桌上的游戏玩家对象
 * @date 2020/9/27 16:39
 */
@Data
@ToString
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class TexasPokerPlayer extends Player {

    /**
     * 牌桌号
     */
    private Long tableNumber;
    /**
     * 玩家所处牌桌位置
     */
    private Integer location;
    /**
     * 手牌
     */
    private Poker[] hands = new Poker[2];
    /**
     * 最终手牌
     */
    private Poker[] finalHands = new Poker[5];
    /**
     * 筹码量
     */
    private Long chips;
    /**
     * 玩家身份
     */
    private TexasIdentity texasIdentity;
    /**
     * 游戏状态
     */
    private TexasGameType gameType;

}
