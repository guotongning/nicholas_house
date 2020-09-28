package com.ning.nicholas_house.other.adapter;

/**
 * @author 不在能知，乃在能行 ——nicholas
 * @description
 * @date 2020/9/28 16:25
 */
public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter = new MediaAdapter();

    @Override
    public void play(String audioType, String fileName) {
        //播放 mp3 音乐文件的内置支持
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("mp3 player " + fileName);
        } else {
            mediaAdapter.play(audioType, fileName);
        }
    }
}
