package com.ning.nicholas_house.other.observer;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        //Observer 注册
        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexaObserver(subject);
        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
