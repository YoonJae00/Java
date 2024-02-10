package Practice;

import java.util.Scanner;

public class Numbergame {

    public static void main(String[] args) {
        //사용자로부터 세 개의 숫자를 입력받아, 이 중에서 가장 큰 숫자를 찾아서 출력하는 프로그램을 작성하세요.
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 숫자 입력 : ");
        int num1 = sc.nextInt();
        System.out.print("두번째 숫자 입력 : ");
        int num2 = sc.nextInt();
        System.out.print("세번째 숫자 입력 : ");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1>num3){
            System.out.println("가장 큰수는 " + num1 + "입니다!");
        }else if(num2 > num1 && num2>num3){
            System.out.println("가장 큰수는 " + num2 + "입니다!");
        } else if (num3 > num1 && num3>num2) {
            System.out.println("가장 큰수는 " + num3 + "입니다!");
        }else
            System.out.println("왜 같은 수를 입력하시나요??");


    }
}
