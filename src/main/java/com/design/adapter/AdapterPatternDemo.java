package com.design.adapter;

/**
 * Created by peng.zhang
 * Description: 适配器模式Demo 入口
 * Time: 2018/12/10-17:40.
 */
public class AdapterPatternDemo {

    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }

}
