package chap04.While;

import java.util.Scanner;

public class Test01 {

    public static void main(String[] args) {

        /* 0시 0분에서 23시 59분 까지 출력하는 프로그램을 작성해보자 */
        int hour = 0;
        while (hour < 24) {
            int min = 0;
            while (min < 60) {
                System.out.println(hour + " 시" + min + " 분");
                min++;
            }
            hour++;
        }
    }
}
