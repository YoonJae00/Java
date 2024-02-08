package Practice;

import java.util.Scanner;

public class Test04 {

    public static void main(String[] args) {


        //문제: 성적 등급 매기기

        //조건 : if문으로 작성할 것

        //90 이상: A
        //80 이상 90 미만: B
        //70 이상 80 미만: C
        //60 이상 70 미만: D
        //60 미만: F
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하여 주세요 ! : ");
        int result = sc.nextInt();

        if (result >= 90) {
            System.out.println("성적은 A입니다!");
        } else if (result >= 80 && result < 90) {
            System.out.println("성적은 B입니다!");
        } else if (result >= 70 && result < 80) {
            System.out.println("성적은 C입니다!");
        } else if (result >= 60 && result < 70) {
            System.out.println("성적은 D입니다!");
        } else {
            System.out.println("F지롱");
        }
    }
}