package chap05;

public class Question06 {

    public static void main(String[] args) {
        //10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고 1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
        // ex.
        //9 7 6 2 5 10 7 2 9 6

        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 10 + 1);
        }
        for (int i : num) {
            System.out.print(i + " ");
        }
        System.out.println();
        //10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고 1~10 사이의 난수를
        //발생시켜 배열에 초기화 후 배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
        // ex. 5 3 2 7 4 8 6 10 9 10
        // 최대값 : 10
        //최소값 : 2
        int max = num[0];
        int min = num[0];

        for (int i = 0; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
            }
            if (min > num[i]) {
                min = num[i];
            }
        }

        System.out.println("최댓값 = " + max);
        System.out.println("최솟값 = " + min);
    }
}

