package Practice;

public class Test02 {

    public static void main(String[] args) {
        // 다섯 자리의 정수를 12345가 있습니다. 각 자리의 숫자를 모두 더한 결과를 출력하세요.
        // 출력값은 1 + 2 + 3 + 4 + 5 = 15 입니다.


        int a = 54321;
        int q = a / 10000; // 1
        int w = (a % 10000) / 1000; // 2
        int e = (a % 1000) / 100; // 3
        int r = (a % 100) / 10; // 4
        int t = a % 10; // 5

        System.out.println(q+w+e+r+t);




    }
}
