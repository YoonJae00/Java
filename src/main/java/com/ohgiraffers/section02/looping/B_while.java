package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_while {

    public void testSimpleWhileStatement() {

        // 수업목표. while 문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다.
        /* 필기
            [while 문 표현식]
            초기식;
            while(조건식){
                조건을 만족하는 경우 수행할 구문(반복할 구문)'
                증감식;
            }
         */

        // 필기. 1부터 10까지 1씩 증가시키면서 (10번) i 값을 출력하는 기본 반복문

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public void testWhileExample1() {

        // 수업목표. while 문의 흐름을 이해하고 적용할 수 있다.(1)
        /* 필기. 입력한 문자열의 인덱스를 이용하여 문자 하나씩 출력해보기 */
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력해주세요 : ");
        String name = sc.nextLine();
        /* 필기.
            charAt() : 문자열에서 인덱스에 해당하는 문자를 char 형으로 반환하는 기능
            length() : String 클래스의 메소드로 문자열의 길이를 int 형을 반환한다.
            index : 0부터 시작하고 마지막 인덱스는 항상 길이보다 한 개 작은 숫자를 가진다.
         */

        System.out.println("============ for문 ============");
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            System.out.println(i + " : " + ch);
        }


        System.out.println("============ while문 ============");
        int index = 0;
        while (index < name.length()) {
            System.out.println(index + " : " + name.charAt(index));
            index++;
        }

    }

    public void testWhileExample2(){

        /* 필기. 중첩 while 문을 이용한 구구단 출력하기. */
        // 2 ~ 9 단

        int dan = 2;
        while (dan <=9){
            System.out.println(" " + dan + " 단 ");
            int su = 1;
            while (su <=9){
                System.out.println(dan + "*" + su + " = " + dan*su);
                su++;
            }
            System.out.println();
            dan ++;
        }



    }
}