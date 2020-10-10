package com.ning.nicholas_house.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author 不在能知，乃在能行 ——nicholas
 * @description
 * @date 2020/9/27 16:41
 */
@Data
@ToString
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class Poker implements Comparable<Poker> {
    /**
     * 牌面标记
     */
    private String number;
    /**
     * 花色
     */
    private String flower;
    /**
     * 值大小
     */
    private Integer value;

    @Override
    public int compareTo(Poker o) {
        return this.getValue().compareTo(o.getValue());
    }
}
