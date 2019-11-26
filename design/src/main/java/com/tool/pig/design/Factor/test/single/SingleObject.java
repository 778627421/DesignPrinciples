package com.tool.pig.design.Factor.test.single;

/**
 * Create by bo.sun on 2019/7/15.
 */
public  class SingleObject {


    //private  static  SingleObject intance;

    private SingleObject(){
    }
    //����ʽ-����ȫ����
    //�̲߳���ȫ
    //��֧�ֶ��̣߳��ȶ��Բ���Ƽ�
//    public static SingleObject getIntance(){
//        if(intance ==  null)
//            return new SingleObject();
//
//     return intance;
//    }
//    ����ʽ-��ȫ����
//    �̰߳�ȫ
//    ֧�ֶ��̣߳�Ч�ʽϵͣ����Ƽ�
//    public static synchronized  SingleObject getIntance(){
//        if(intance == null)
//            return  new SingleObject();
//
//        return intance;
//    }

    //JDK1.5�Ժ�
    //˫����-˫��У����
    //�̰߳�ȫ
    //֧�ֶ��̣߳������ܣ��Ƽ�
    private volatile  static SingleObject intance;

   public static SingleObject getIntance(){
       if(intance == null) {
           synchronized (SingleObject.class) {
               if (intance == null)
                   return new SingleObject();
           }
       }
        return intance;
   }
//
//
    public  void showMessage(){
        System.out.print("˫����-˫��У����:SingleObject^s output");
    }


}
