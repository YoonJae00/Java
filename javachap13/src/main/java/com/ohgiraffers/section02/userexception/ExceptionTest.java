package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int money) throws PriceNegativeException, MoneyNegativeException, NotEnoughMoneyException {

        if (price < 0) {
            throw new PriceNegativeException("상품의 가격은 음수일 수 없습니다.");
        }

        if (money < 0){
            throw new MoneyNegativeException("돈은 음수일 수 없습니다.");
        }

        if(money < price){
            throw new NotEnoughMoneyException("상품의 가격보다 돈의 가격이 적습니다.");
        }

        System.out.println("가진 돈이 충분합니다!");
    }


}
