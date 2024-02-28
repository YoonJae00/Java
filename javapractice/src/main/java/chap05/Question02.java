package chap05;

import java.util.Scanner;

public class Question02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열값을 입력하세요 : ");
        int[] num = new int[sc.nextInt()];
        int sum = 0;
        for(int i = 0; i < num.length; i++){
            System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
            num[i]= sc.nextInt();
            sum += num[i];
        }
        System.out.println("총합 : " + sum);


    }
}
