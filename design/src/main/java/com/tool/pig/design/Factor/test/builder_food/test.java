package com.tool.pig.design.Factor.test.builder_food;

/**
 * Create by bo.sun on 2019/7/29.
 */
public class test {
    public static void main(String[] args) {

        MealA  mealA = new MealA();
        MealB  mealB = new MealB();

        KFCwaiter cwaiter = new KFCwaiter();

        cwaiter.setBuilder(mealA);
        ProjectVo vo =  cwaiter.makeDishes();
        //�ͻ�����һ��KFC A�ײ�
        System.out.print("�ͻ�A����һ�ݰ���:"+vo.getFood()+"��"+vo.getDrink()+"��A�ײ�\n");


        cwaiter.setBuilder(mealB);
        ProjectVo vo1 =  cwaiter.makeDishes();
        //�ͻ�����һ��KFC A�ײ�
        System.out.print("�ͻ�B����һ�ݰ���:"+vo1.getFood()+"��"+vo1.getDrink()+"��B�ײ�\n");

    }
}
