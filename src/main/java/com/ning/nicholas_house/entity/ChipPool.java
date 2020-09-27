package com.ning.nicholas_house.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @author 不在能知，乃在能行 ——nicholas
 * @description
 * @date 2020/9/27 17:06
 */
@Data
@ToString
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class ChipPool {
    /**
     * 筹码池总额
     */
    private Long allChips;
    /**
     * 下注记录
     */
    private List<String> record;
}
