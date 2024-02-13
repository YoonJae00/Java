package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_for {

    public void timeSimpleForStatement() {

        // 수업목표. for문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다.
        /* 필기.
            [for 문 표현식]
            for(초기식; 조건식; 증감식){
                조건을 만족하는 경우 수행할 구문(반복할 구문);
            }
         */

        // 필기. 1부터 10까지 1씩 증가시키면서(10번) i 값을 출력하는 기본 반복문
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

    }

    public void tesmForExample1() {
        // 수업목표. 무엇을 반복하는 지 확인하여 반복문으로 개선할 수 있다.(1)

        // 필기. 5명의 학생 이름을 입력받아 이름을 출력해보자.

        Scanner sc = new Scanner(System.in);

        System.out.print("1번 째 학생의 이름을 입력해주세요 : ");
        String student1 = sc.nextLine();
        System.out.print("1번 째 학생의 이름은 " + student1 + " 입니다.");

        System.out.print("2번 째 학생의 이름을 입력해주세요 : ");
        String student2 = sc.nextLine();
        System.out.print("2번 째 학생의 이름은 " + student2 + " 입니다.");

        System.out.print("3번 째 학생의 이름을 입력해주세요 : ");
        String student3 = sc.nextLine();
        System.out.print("3번 째 학생의 이름은 " + student3 + " 입니다.");

        System.out.print("4번 째 학생의 이름을 입력해주세요 : ");
        String student4 = sc.nextLine();
        System.out.print("4번 째 학생의 이름은 " + student4 + " 입니다.");

        System.out.print("5번 째 학생의 이름을 입력해주세요 : ");
        String student5 = sc.nextLine();
        System.out.print("5번 째 학생의 이름은 " + student5 + " 입니다.");

        System.out.println("5명의 학생 이름을 입력 받고 출력하는 기능 완료!!!");

        /* 필기.
            반복해야 하는 내용?
            1. 안내문구 출력
            2. 학생의 이름을 입력 받아 변수 저장
            3. 저장된 이름을 출력
         */

        /* 필기.
            반복 횟수는 1부터 5까지
         */
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + "번 째 학생의 이름을 입력해주세요 : ");
            String student = sc.nextLine();
            System.out.println(i + "번 째 학생의 이름은" + student + " 입니다.");
        }
    }

    public void testForExample2() {
        // 수업목표. 무엇을 반복하는 지 확인하여 반복문으로 개선해보기

        /* 필기.
            문장 속에서 규칙 찾기
            1 ~ 10 까지의 합계를 구하시오.
         */

        // 필기. 1부터 10까지를 변수에 저장
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        int num5 = 5;
        int num6 = 6;
        int num7 = 7;
        int num8 = 8;
        int num9 = 9;
        int num10 = 10;

        // 필기. 결과를 누적시켜 담아줄 변수 선언
        int sum = 0;

        // 필기. sum에 변수의 값 하나씩 담기
        sum += num1;
        sum += num2;
        sum += num3;
        sum += num4;
        sum += num5;
        sum += num6;
        sum += num7;
        sum += num8;
        sum += num9;
        sum += num10;

        System.out.println("sum = " + sum);

        int sum2 = 0;

        for (int i = 0; i <= 10; i++) {
            sum2 += i;
        }
        System.out.println("sum2 = " + sum2);

    }

    public void testForExample3() {
        // 수업목표. 무엇을 반복하는 지 확인하여 반복문으로 개선할 수 있다.(3)

        /* 필기
            5 ~ 10 사이의 난수를 발생시켜
            1부터 발생한 난수까지의 합계를 구해보자.
         */

        int random = (int) (Math.random() * 6) + 5;
        System.out.println("random = " + random);
        // 필기. 무언가 더해서 담기 위해 sum 변수를 0으로 초기화
        int sum = 0;

        if (random == 5) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
        } else if (random == 6) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
        } else if (random == 7) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
            sum += 7;
        } else if (random == 8) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
            sum += 7;
            sum += 8;
        } else if (random == 9) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
            sum += 7;
            sum += 8;
            sum += 9;
        } else {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
            sum += 7;
            sum += 8;
            sum += 9;
            sum += 10;
        }
        System.out.println("합계는 " + sum + "입니다.");
        int sum1 = 0;
        for (int i = 1; i <= random; i++) {
            sum1 += i;
        }
        System.out.println("합계는 " + sum1 + "입니다.");

    }


    public void testForExample4() {

        /* 필기.
            숫자 두 개를 입력받아 작은 수 에서 큰 수 까지의 합계를 구하세요
            단, 두 숫자는 같은 숫자를 입력하지 않는다는 가정으로 해결한다.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자 입력 : ");
        int fisrt = sc.nextInt();
        System.out.print("두 번째 숫자 입력 : ");
        int second = sc.nextInt();

        int max = Math.max(fisrt, second);
        int min = Math.min(fisrt, second);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        int sum = 0;
        for (int i = min; i <= max; i++) sum += i;
        System.out.println("두수의 합 = " + sum);

        /* 필기.
            결국 작은 수 부터 시작해서 큰 수까지의 합계를 구하는 것이기 때문에
            first 와 second 중 어느 것이 큰 수 인지 확인하면
            작은수 ~ 큰수 까지의 합계를 구하는 로직으로 바꿀 수 있다.
         */

        // 필기. 더 큰 값과 작은 값을 저장할 변수를 초기화 한다.
        // 위에 씀.

    }

    public void printSimpleGugudan() {

        /*필기.
            키보드로 2~9 사이의 구구단을 입력 받아
            2 ~ 9 사이인 경우 해당 단의 구구단을 출력하고,
            그렇지 않은 경우 "반드시 2 ~ 9 사이의 양수를 입력해야 합니다" 출력
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("단수 입력 : ");
        int dan = sc.nextInt();
        if (dan >= 2 && dan <= 9) {
            for (int i = 1; i <= 9; i++) {
                System.out.println(dan + " * " + i + " = " + dan * i);
            }
        } else System.out.println("반드시 2 ~ 9 사이의 양수를 입력해야 합니다");
    }

    public void test01() {
        Scanner sc = new Scanner(System.in);
        System.out.print("중첩 단수 설정(-10 ~ 20) : ");
        int dan = sc.nextInt();
        int num = 0;
        if (dan >= -10 && dan <= 20) {
            for (int i = dan; i <= 9; i++) {
                for (int j = 1; j <= 9; j++) {
                    for (int k = 0; k <= 9; k++) {
                        num++;
                        System.out.println(i + " * " + j + " * " + k + " = " + i * j * k);
                    }
                }
            } System.out.println("출력횟수 : " + num);
        } else System.out.println("땡!!!!!!!!!!!");


    }
}
