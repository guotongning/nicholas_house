package com.ning.nicholas_house.other.adapter;

/**
 * @author 不在能知，乃在能行 ——nicholas
 * @description
 * @date 2020/9/28 16:12
 */
public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer getPlayer(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            return new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            return new Mp4Player();
        }
        throw new NullPointerException("未知的格式");
    }

    @Override
    public void play(String audioType, String fileName) {
        getPlayer(audioType).play(fileName);
    }
}
