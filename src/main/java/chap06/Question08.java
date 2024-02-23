package chap06;

import java.util.Scanner;

public class Question08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("두 정수와 연산자를 입력하시오.");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.nextLine();
        char cal = sc.nextLine().charAt(0);

        switch (cal) {
            case '+':
                Add app1 = new Add();
                app1.setValue(num1, num2);
                System.out.println(app1.calculate());
            case '-':
                Sub app2 = new Sub();
                app2.setValue(num1, num2);
                System.out.println(app2.calculate());
            case '*':
                Mul app3 = new Mul();
                app3.setValue(num1, num2);
                System.out.println(app3.calculate());
            case '/':
                Div app4 = new Div();
                app4.setValue(num1, num2);
                System.out.println(app4.calculate());
        }
    }
}



