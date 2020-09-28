package com.ning.nicholas_house.other.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 不在能知，乃在能行 ——nicholas
 * @description
 * @date 2020/9/28 15:51
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
