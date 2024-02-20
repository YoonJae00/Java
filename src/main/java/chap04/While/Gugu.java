package chap04.While;

public class Gugu {
    public static void main(String[] args) {
        // 구구단 출력 2~9단
        int dan = 2;
        int su1 = 1;
        while (dan < 10) {
            while (su1 < 10) {
                System.out.print(dan + " * " + su1 + " = " + dan * su1);
                su1++;
                System.out.println();
            }
            dan++;
            su1 = 1;
        }


    }
}
