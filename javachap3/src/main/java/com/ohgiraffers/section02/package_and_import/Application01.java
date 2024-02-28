package com.ohgiraffers.section02.package_and_import;


import com.ohgiraffers.section01.method.Calculator;

public class Application01  {

    public static void main(String[] args) {

        // 수업목표. 패키지에 대해 이해할 수 있다.
        /* 필기.
                서로 관련 있는 클래스 또는 인터페이스 등을 모아 하나의 묶음(그룹)으로 단위를 구성하는 것을 말한다.
                같은 패키지 내에서는 동일한 이름의 클래스를 만들 수 없지만, 패키지가 다르면 동일한 이름을 가진 클래스를
                만들 수 있다. 클래스명은 원래 패키지명을 포함하고 있기 때문이다.
                ex) com.ohgiraffers.section.method.Calculator
         */

        // 목차. 1. non-static 메소드의 경우 (다른 패키지에서 클래스 가져오기)
        com.ohgiraffers.section01.method.Calculator calc = new com.ohgiraffers.section01.method.Calculator();
        int min = calc.minNumberOf(30, 20);

        Calculator app = new Calculator();
    }
}
