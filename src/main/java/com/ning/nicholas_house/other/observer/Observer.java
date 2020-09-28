package com.ning.nicholas_house.other.observer;

/**
 * @author 不在能知，乃在能行 ——nicholas
 * @description
 * @date 2020/9/28 15:52
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
