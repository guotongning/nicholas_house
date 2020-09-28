package com.ning.nicholas_house.other.observer;

/**
 * @author 不在能知，乃在能行 ——nicholas
 * @description
 * @date 2020/9/28 16:00
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("state 8进制 String : " + Integer.toOctalString(subject.getState()));
    }
}
