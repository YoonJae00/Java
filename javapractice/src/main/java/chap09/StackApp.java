package chap09;

import java.util.Scanner;

public class StackApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("총 스택 저장 공간의 크기 입력 >> ");
        int num = sc.nextInt();
        sc.nextLine();
        StringStack SS = new StringStack();
        SS.length(num);
        String[] a = new String[num];
        for(int i = 0 ; i < num ; i++) {
            System.out.print("문자열 입력 >> ");
            a[i] = sc.nextLine();
            SS.capacity();
        }
        System.out.print("문자열 입력 >> ");
        sc.nextLine();
        System.out.println("스택이 꽉 차서 푸시 불가! ");

        System.out.print("스택에 저장된 모든 문자열 팝 : ");
        for(int i = 0 ; i< a.length; i++){
            System.out.print( a[i] + " ");
        }







    }

}
