package com.tool.pig.design.Factor.test.adapter;

public class AdapterTest {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("MP3","You`re Beautiful");
        audioPlayer.play("MP4","С������");
        audioPlayer.play("VLC","��è����");
        audioPlayer.play("XXX","ZZZZZ");
    }
}
