package com.ning.nicholas_house.other.observer;

/**
 * @author 不在能知，乃在能行 ——nicholas
 * @description
 * @date 2020/9/28 15:55
 */
public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("state 2进制 String : " + Integer.toBinaryString(subject.getState()));
    }
}
