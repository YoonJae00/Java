package Practice;

import java.util.Scanner;

public class Test04_01 {

    public static void main(String[] args) {

        // switch 문
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요. : ");
        int score = sc.nextInt();

        //switch문 작성
        int result = score / 10;
        switch (result){
            case 10:
            case 9:
                System.out.println("당신의 성적은 A!!");
                break;
            case 8:
                System.out.println("당신의 성적은 B!!");
                break;
            case 7:
                System.out.println("당신의 성적은 C!!");
                break;
            case 6 :
                System.out.println("당신의 성적은 D!!");
                break;
            default:
                System.out.println("당신의 성적은 F!!");
                break;
        }


    }
}
