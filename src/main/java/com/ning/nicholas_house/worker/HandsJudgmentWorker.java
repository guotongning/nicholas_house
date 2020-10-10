package com.ning.nicholas_house.worker;

import com.ning.nicholas_house.entity.Poker;
import org.apache.commons.lang3.ArrayUtils;

/**
 * @author 不在能知，乃在能行 ——nicholas
 * @description 判断每位玩家的最终手牌，即自动帮每位玩家用手牌和明牌组成最大的手牌。
 * @date 2020/10/10 17:17
 */
public class HandsJudgmentWorker {
    public static Poker[] getFinalHands(Poker[] hands, Poker[] publicPoker) {
        return null;
    }

    /**
     * 同花顺
     */
    public static Poker[] straightFlush(Poker[] hands, Poker[] publicPoker) {
//        Poker[] bb = hands;
//        Poker[] aa = publicPoker;
        Poker[] allHands = ArrayUtils.addAll(hands, publicPoker);
        QuickSort(allHands, 0, allHands.length - 1);
        System.out.println();
        return null;
    }

    /**
     * 快排
     */
    /**
     * 快速排序
     *
     * @param num   排序的数组
     * @param left  数组的前针
     * @param right 数组后针
     */
    private static void QuickSort(Poker[] num, int left, int right) {
        //如果left等于right，即数组只有一个元素，直接返回
        if (left >= right) {
            return;
        }
        //设置最左边的元素为基准值
        Poker key = num[left];
        //数组中比key小的放在左边，比key大的放在右边，key值下标为i
        int i = left;
        int j = right;
        while (i < j) {
            //j向左移，直到遇到比key小的值
            while (num[j].getValue() >= key.getValue() && i < j) {
                j--;
            }
            //i向右移，直到遇到比key大的值
            while (num[i].getValue() <= key.getValue() && i < j) {
                i++;
            }
            //i和j指向的元素交换
            if (i < j) {
                Poker temp = num[i];
                num[i] = num[j];
                num[j] = temp;
            }
        }
        num[left] = num[i];
        num[i] = key;
        QuickSort(num, left, i - 1);
        QuickSort(num, i + 1, right);
    }
}
