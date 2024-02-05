package com.ohgiraffers.section05.logical;

public class Test02 {

    public static void main(String[] args) {

        // 두 수를 비교하여 결과를 boolean으로 반환하는 메서드
        boolean result = compareNumbers(5, 3);

        // boolean 변수를 사용한 조건문 예제
        if (result) {
            System.out.println("첫 번째 숫자가 더 큽니다.");
        } else {
            System.out.println("두 번째 숫자가 더 크거나 같습니다.");
        }
    }

    // 두 수를 비교하여 결과를 boolean으로 반환하는 메서드
    static boolean compareNumbers(int a, int b) {
        return a > b;

    }
}
