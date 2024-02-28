package chap05;

public class Question06_1 {

    public static void main(String[] args) {
        //10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고 1~10 사이의 난수를 발생시켜
        // 중복된 값이 없게 배열에 초기화한 후 출력하세요.
        //ex.
        //4 1 3 6 9 5 8 10 7 2
        int[] arr = new int[10];
        boolean[] used = new boolean[11];    // 중복된 값 체크 (false 가 기본형)

        for (int i = 0; i < arr.length; i++){
            int num;
            do{
                num = (int)(Math.random()*10)+1;
            }while (used[num]);
            arr[i] = num;
            used[num] = true;
            System.out.print(arr[i] + " ");
        }

    }
}