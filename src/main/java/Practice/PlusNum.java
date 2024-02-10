package Practice;

import java.util.Scanner;

public class PlusNum {

    public static void main(String[] args) {
        //사용자로부터 정수 n을 입력받아서, 1부터 n까지의 합을 구하는 프로그램을 작성하세요.
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int n = sc.nextInt();

        int result = n*(1+n)/2;
        System.out.println("result = " + result);

    }
}
