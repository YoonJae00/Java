package Practice;

import java.util.Scanner;

public class Test01 {

    public static void main(String[] args) {

        int result = 57;
        Scanner a = new Scanner(System.in);

        System.out.println("답을 추론해보세요 : ");
        int number = a.nextInt();
        String q = (number == 57)? "정답!!!" : (number > 57) ? "작습니다" : "큽니다";
        System.out.println(q);


    }
}
