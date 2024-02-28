package chap05;

import java.util.Scanner;

public class Question08 {

    public static void main(String[] args) {
        //문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고 문자의 개수와 함께 출력하세요.
        //문자열 : application
        //문자열에 있는 문자 : a, p, l, i, c, t, o, n
        //문자 개수 : 8
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String name = sc.nextLine();
        char[] carr = new char[name.length()];
        int num = 0;
        for (int i = 0; i < name.length(); i++) {
            for (int j = 0; j < i; j++) {
                if(carr[i]==carr[j]){
                    i--;
                }else{
//                    carr[i];
                }
            }
            num++;
        }

        for (int i = 0; i < carr.length; i++) {
            System.out.print(carr[i] + " ");
        }
        System.out.println("문자갯수 : " + num);
    }
}
