package com.ning.nicholas_house.other.adapter;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("vlc player " + fileName);
    }
}
