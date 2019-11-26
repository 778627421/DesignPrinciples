package com.tool.pig.design.Factor.test.adapter;

public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String playType, String fileName) {
        //��ǰ����ֻ�����㲥��MP3
        if(playType.equalsIgnoreCase("MP3")){
            System.out.printf("����MP3,�ļ�������"+fileName+"\n");
        }
        //��һ����������ʹ������Բ���MP4,VLC��
        else if(playType.equalsIgnoreCase("MP4")||playType.equalsIgnoreCase("VLC")){
            MediaAdapter adapter = new MediaAdapter(playType);
            adapter.play(playType,fileName);
        }else{
            System.out.println("�ݲ�֧���㲥�ŵ�"+
                    playType + "��ʽ�ļ�"+"\n");
        }
    }
}
