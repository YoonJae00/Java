package chap06;

import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        Circle c[] = new Circle[3]; // 3개의 Circle 배열 선언

        for (int i = 0; i < c.length; i++) {
            System.out.print("x, y, radius >>");
            double x = sc.nextDouble();  // x값 읽기.
            double y = sc.nextDouble(); // y값 읽기.
            int z = sc.nextInt(); // radius값 읽기.
            c[i] = new Circle(x, y, z); // Circle 객체 생성
        }
        for (int i = 0; i < c.length; i++)
            c[i].show(); // 모든 Circle 객체 출력
        sc.close();
    }
}
