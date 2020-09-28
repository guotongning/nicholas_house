package com.ning.nicholas_house.other.adapter;

public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void play(String fileName) {
        System.out.println("mp4 player " + fileName);
    }
}
