package com.tool.pig.design.Factor.test.adapter;

public class Mp4Player implements AdvanceMediaPlayer {
    @Override
    public void playMp4(String fileName) {
        System.out.printf("����MP4,�ļ�������"+fileName+"\n");
    }
    @Override
    public void PlayVlc(String fileName) {
        //ʲôҲ������
    }
}
