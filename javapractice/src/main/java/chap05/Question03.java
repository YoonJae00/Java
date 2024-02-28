package chap05;

import java.util.Scanner;

public class Question03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();
        if (num % 2 == 0 || num < 3) {
            System.out.println("다시입력하세요");
        }
        else {
            int[] arr = new int[num];
            for (int i = 0; i <= (arr.length / 2); i++) {
                arr[i] = i + 1;
            }
            for (int i = (arr.length / 2 + 1); i < arr.length; i++) {
                arr[i] = arr.length - i;
            }
            for (int i = 0; i < arr.length; i++){
                System.out.print(arr[i]);
            }
        }


    }
}
