package com.ning.nicholas_house.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author 不在能知，乃在能行 ——nicholas
 * @description 玩家对象
 * @date 2020/9/27 16:31
 */
@Data
@ToString
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class Player extends User {
    /**
     * 玩家账户总余额
     */
    private Long balance;
    /**
     * 玩家状态
     */
    private PlayerStatus playerStatus;


}
