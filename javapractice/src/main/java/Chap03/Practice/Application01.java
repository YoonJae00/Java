package Chap03.Practice;

public class Application01 {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        calc.checkMethod();
        System.out.println("10과 20의 합 : " + calc.sumTwoNumber(10,20));
        System.out.println("10과 5의 차 : " + calc.minusTwoNumber(12,5));
        System.out.println("10과 5의 곱 : " + calc.multiTwoNumber(10,5));
        System.out.println("10과 5의 나눈 후 몫 : " + calc.divideTwoNumber(10,5));



    }


}
