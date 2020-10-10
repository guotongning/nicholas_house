package com.ning.nicholas_house.worker;

import com.ning.nicholas_house.entity.Poker;

/**
 * @author 不在能知，乃在能行 ——nicholas
 * @description
 * @date 2020/10/10 16:43
 */
public class PokerPrinter {
    public static void printPoker(Poker poker) {
        if (poker.getNumber().length() == 1) {
            System.out.println("┌─────┐");
            System.out.println("│" + poker.getFlower() + "    │");
            System.out.println("│  " + poker.getNumber() + "  │");
            System.out.println("│    " + poker.getFlower() + "│");
            System.out.println("└─────┘");
        } else {
            System.out.println("┌─────┐");
            System.out.println("│" + poker.getFlower() + "    │");
            System.out.println("│  " + poker.getNumber() + " │");
            System.out.println("│    " + poker.getFlower() + "│");
            System.out.println("└─────┘");
        }
    }

    public static void printPoker(Poker[] pokers) {
        for (int i = 0; i < pokers.length; i++) {
            System.out.print("┌─────┐");
            System.out.print("\t");
        }
        System.out.println();
        for (Poker poker : pokers) {
            System.out.print("│" + poker.getFlower() + "    │");
            System.out.print("\t");
        }
        System.out.println();
        for (Poker poker : pokers) {
            if (poker.getNumber().length() == 1) {
                System.out.print("│  " + poker.getNumber() + "  │");
            } else {
                System.out.print("│  " + poker.getNumber() + " │");
            }
            System.out.print("\t");
        }
        System.out.println();
        for (Poker poker : pokers) {
            System.out.print("│    " + poker.getFlower() + "│");
            System.out.print("\t");
        }
        System.out.println();
        for (int i = 0; i < pokers.length; i++) {
            System.out.print("└─────┘");
            System.out.print("\t");
        }
        System.out.println();
    }
}
