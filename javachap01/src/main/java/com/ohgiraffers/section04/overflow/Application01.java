package com.ohgiraffers.section04.overflow;

public class Application01 {

    public static void main(String[] args) {

        /* 수업목표. 오버플로우에 대해 이해할 수 있다. */
        /* 필기.
                자료형 별 값의 최대 범위를 벗어난 경우
                발생한 carry를 버림처리 하고 sign bit를 반전시켜 최솟값으로 순환시킴.
                sign bit 자리를 침범하게 되면 강제로 (+ -)를 반전시킴.
         */

        // 목차. 1. 오버플로우
        byte num1 = 127;

        System.out.println("num1 : " + num1);       //127 : byte의 최대 저장 범위

        num1++;     // 1증가

        System.out.println("num1 overflow : " + num1);       //-128 : byte의 최소 저장 범위


        /* 목차. 2. 언더플로우 */
        // 필기. 오버플로우와 반대 개념으로 최소 범위보다 작은 수를 발생시키는 경우 발생하는 현상이다.

        byte num2 = -128;

        num2--;

        System.out.println("num1 underflow : " + num2);

        int fisrtNum = 1000000;     // 백만
        int secondNum = 700000;     // 70만

        int multi = fisrtNum * secondNum;

        System.out.println(" fisrtNum * secondNum : " + multi);

        /* 목차. 3. 해결방법 */
        // 필기. 오버플로우를 예측하고 더 큰 자료형으로 결과값을 받아서 처리한다.

        long longMulti = fisrtNum * secondNum;      // 7천억

        System.out.println("longMulti : " + longMulti );      //안됨

        long result = (long) fisrtNum * secondNum;
        // Q. long result = (long) (fisrtNum * secondNum);

        System.out.println("result : " + result);

    }
}
