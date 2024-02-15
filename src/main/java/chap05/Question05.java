package chap05;

import java.util.Scanner;

public class Question05 {

    public static void main(String[] args) {
        //주민등록번호 성별자리 이후부터 *로 가리고 출력하세요. 단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.
        //ex.
        //주민등록번호(-포함) : 123456-1234567
        //123456-1******
        Scanner sc = new Scanner(System.in);
        System.out.print("주민등록번호를 입력하세요(-포함) : ");
        String num = sc.nextLine();

        char[] num1 = new char[15];

        for (int i = 0; i < num.length(); i++) {
            num1[i] = num.charAt(i);
        }

        for (int i = 8; i < num.length(); i++) {
            num1[i] = '*';
        }
        for(int i = 0; i <num.length(); i++){
            System.out.print(num1[i]);
        }

    }
}
