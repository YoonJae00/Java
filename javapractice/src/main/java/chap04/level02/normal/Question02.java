package chap04.level02.normal;

import java.util.Scanner;

public class Question02 {

    public static void main(String[] args) {
        /* 두 과목의 평균이 60점 이상이면 합격
         * 한 과목이라도 40점 미만이면 불합격
         *
         * 2과목에 대한 값을 입력 받고 합계와 평균을 이용하여 구하시오.
         * ex) 영어 30, 수학 90
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 점수를 입력하세요 : ");
        double a1 = sc.nextInt();
        System.out.print("두번째 점수를 입력하세요 : ");
        double a2 = sc.nextInt();

        int plus = (int)(a1 + a2);
        double avg = (a1 + a2)/2;

        if(a1<40 || a2<40){
            System.out.println("불합격");
        }else if (avg>=60){
            System.out.println("합격");
        }

    }
}
