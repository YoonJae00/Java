package com.ohgiraffers.section01.method;

public class Test10 {

    public static void main(String[] args) {

        String name = "소환사 이름";
        int hp = 10000;
        char mp = '겨';
        double time = 20.666;
        Test10 app10 = new Test10();
        app10.methodTest(name,hp,mp,time);


    }


    public void methodTest(String name,int hp,char mp,double time){

        System.out.println("name = " + name + ", hp = " + hp + ", mp = " + (double)mp + ", time = " + (int)time);


    }
}
