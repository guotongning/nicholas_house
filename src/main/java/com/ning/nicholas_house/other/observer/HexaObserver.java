package com.ning.nicholas_house.other.observer;

/**
 * @author 不在能知，乃在能行 ——nicholas
 * @description
 * @date 2020/9/28 16:01
 */
public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("state 16进制 String : " + Integer.toHexString(subject.getState()));
    }
}
