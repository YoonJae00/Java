package chap04.While;

import java.util.Scanner;

public class Question01 {

    public static void main(String[] args) {
        /* 1부터 10까지의 숫자를 출력하는 프로그램 */
        int i1 = 1;
        while (i1 <= 10) {
            System.out.println(i1);
            i1++;
        }
        /* 10부터 1까지의 숫자를 역순으로 출력하는 프로그램 */
        int i2 = 10;
        while (i2 >= 1) {
            System.out.println(i2);
            i2--;
        }

        /* 구구단 7단을 출력하는 프로그램 */
        int su = 1;
        while (su <= 9) {
            int num;
            num = 7 * su;
            System.out.println(num);
            su++;
        }

        /* 1부터 100까지의 숫자 중 짝수만 출력하는 프로그램 */
        int num1 = 1;
        while (num1 <= 100) {
            if (num1 % 2 == 1){
                num1++;
                continue;
            }
            else System.out.println(num1);
            num1++;
        }

        /* 사용자로부터 입력받은 숫자의 팩토리얼을 계산하는 프로그램
         *   팩토리얼은 6! = 1 * 2 * 3 * 4 * 5 * 6
         * */

        Scanner sc = new Scanner(System.in);
        System.out.print("팩토리얼 입력 : ");
        int fact = sc.nextInt();
        int sum = 1;
        do {
            sum = sum * fact;
            fact--;
        }while (fact>=1);
        System.out.println(sum);

        /* 0시 0분에서 23시 59분 까지 출력하는 프로그램을 작성해보자 */

        int hour = 0;
        int min = 1;
        while (hour <24 ){
            while(min<60){
                System.out.println(hour + " 시" + min + " 분");
                min++;
            }
            hour++;
        }

    }
}
