package chap04.looping;

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {

        /* 1부터 10까지의 숫자를 출력하는 프로그램 */
        for (int i = 1; i <= 10; i++) System.out.println(i);

        /* 10부터 1까지의 숫자를 역순으로 출력하는 프로그램 */
        for (int i = 10; i <= 0; i--) System.out.println(i);
        /* 구구단 7단을 출력하는 프로그램 */
        for (int i = 1; i <= 9; i++) System.out.println("7 곱하기 " + i + " 는 " + 7 * i);
        /* 1부터 100까지의 숫자 중 짝수만 출력하는 프로그램 */
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) System.out.println(i);
        }
        /* 사용자로부터 입력받은 숫자의 팩토리얼을 계산하는 프로그램
         *   팩토리얼은 6! = 1 * 2 * 3 * 4 * 5 * 6
         * */
//        Scanner sc = new Scanner(System.in);
//        System.out.print("팩토리얼 정수값 입력 : ");
//        int fact = sc.nextInt();
//        int sum = 1;
//        for (int i = 1; i <= fact; i++) {
//            sum = i * sum;
//        }
//        System.out.println("팩토리얼은 " + fact + "! = " + sum);

        /* 0시 0분에서 23시 59분 까지 출력하는 프로그램을 작성해보자 */

        for (int i = 0; i <= 23; i++) {
//            System.out.print(i + "시 " );
            for (int j = 0; j <= 59; j++) {
                System.out.println(i + "시 " + j + "분");
            }
        }

        /* 별 만들기 게임
         *   *
         *   **
         *   ***
         *   ****
         *   *****
         *   이런 식으로 행이 늘어날 때 별도 들어나는 식을 만들어보자
         *
         *  */

        for (int i = 0; i <= 5; i++) {
            System.out.println();//행
            for (int j = 0; j < i; j++) {
                System.out.print('*'); // * 하나씩 늘어나기
            }
        }

        /* 별 만들기 게임
         *      *       공백 3개
         *     ***      공백 2개
         *    *****     공백 1개
         *   *******
         *
         *   이런 식으로 행이 늘어날 때 별도 들어나는 식을 만들어보자
         *
         *  */

        for (int i = 1; i <= 5; i++) {
            int a = 3;
            for(int j = 0; j < (2*i-1); j++){
                for(int k = a; k >- 0; k--) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for(int k = a; k >- 0; k--) {
                    System.out.print(" ");
                }
                a--;
            }
        }


    }

}