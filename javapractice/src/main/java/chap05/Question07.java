package chap05;

import java.util.Scanner;

public class Question07 {

    public static void main(String[] args) {
        //문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고 문자의 개수와 함께 출력하세요.
        //문자열 : application
        //문자열에 있는 문자 : a, p, p, l, i, c, a, t, i, o, n
        //문자 개수 : 11
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String name = sc.nextLine();
        char[] arr = new char[name.length()];
        for(int i = 0; i < name.length(); i++){
            arr[i] = name.charAt(i);
        }
        System.out.print("문자열에 있는 문자 : ");
        for( char i : arr){
            System.out.print(i + ", ");
        }
        System.out.println("문자 개수 : " + name.length());

    }
}
