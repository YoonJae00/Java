package com.ohgiraffers.section01.exception;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int money) throws Exception {

        System.out.println("가지고 있는 돈 : " + money);
        if (money >= price){
            System.out.println("상품을 구입하기 위한 금액이 충분합니다!!!");
            System.out.println("남은돈 : " + (money - price));
        }else {
                    /* 필기.
                        강제로 예외를 발생
                        예외를 발생시킨 쪽에서는 throws 로 예외에 대한 책임을 위임 (너가해라) 해서
                        해당 예외에 대한 처리를 강제화 한다.*/
            throw new Exception();
        }
        System.out.println("즐거운 쇼핑하세요~");
    }

}
