package com.tool.pig.design.Factor.test.adapter;

public class VlcPlayer  implements AdvanceMediaPlayer{
    @Override
    public void playMp4(String fileName) {
        //ʲôҲ����
    }

    @Override
    public void PlayVlc(String fileName) {
        System.out.printf("����VLC,�ļ�������"+fileName+"\n");

    }
}
