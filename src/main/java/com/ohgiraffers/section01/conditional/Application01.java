package com.ohgiraffers.section01.conditional;

public class Application01 {

    public static void main(String[] args) {

        A_if app1 = new A_if();
//        app1.testSimpleIfStatement();
//        app1.testNestedIfStatement();

        B_ifElse app2 = new B_ifElse();
//        app2.testSimpleIfElseStatement();
//        app2.testNestedIfElseStatement();

        C_ifElseif app3 = new C_ifElseif();
//        app3.testSimpleIfElseIfStatement();

        D_switch app4 = new D_switch();
        app4.testSimpleSwitchStatement();

    }

}
