package chap05;

import java.util.Arrays;

public class Question09 {

    public static void main(String[] args) {
        //로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이 오름차순으로 정렬하여 출력하세요.
        //ex.
        //3 4 15 17 28 40

        int[] lotto = new int[6];
        boolean[] num = new boolean[7];

        for (int i = 0; i < lotto.length; i++) {

            do {
                lotto[i] = (int) (Math.random() * 45) + 1;
            } while (num[i]);

//            while (num[lotto[i] = (int) (Math.random() * 45) + 1]) ;
//            while (num[lotto[i] = (int) (Math.random() * 45) + 1])

            num[i] = true;

//            System.out.print(lotto[i] + " ");

        }
        Arrays.sort(lotto);
        for (int i : lotto) {
            System.out.print(i + " ");
        }
    }
}
