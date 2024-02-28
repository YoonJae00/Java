package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.method.Calculator;

public class Test01 {
    public static void main(String[] args) {


        com.ohgiraffers.section01.method.Calculator app1 = new com.ohgiraffers.section01.method.Calculator();
        app1.minNumberOf(20,40);

        Calculator.maxNumberOf(70,20);
        // static 은 다른 패키지도 미리 로딩됨??? ㄴㄴ 임포트

    }
}
