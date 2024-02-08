package Practice;

import java.util.Scanner;

public class Test05 {

    public static void main(String[] args) {
        /*switch문을 사용하여 아래 조건에 맞는 코드를 작성하시오.
        점수를 입력 받아 "수우미양가"를 평가하는 프로그램
        점수가 90점 이상이면 ‘수’,
        80점이상 이고 90점 미만이면 ‘우’,
        70점이상 이고 80점미만이면 ‘미’,
        60점이상 70점 미만이면 ‘양’,
        나머지는 ‘가’ 로 출력
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요. : ");
        int score = sc.nextInt();
        String grade = "가";

        //switch문 작성
        int result = score / 10;
        switch (result){
            case 10:
            case 9:
                System.out.println("당신의 성적은 수!!");
                break;
            case 8:
                System.out.println("당신의 성적은 우!!");
                break;
            case 7:
                System.out.println("당신의 성적은 미!!");
                break;
            case 6 :
                System.out.println("당신의 성적은 양!!");
                break;
            default:
                System.out.println("당신의 성적은 가!!");
                break;
        }


    }
}
