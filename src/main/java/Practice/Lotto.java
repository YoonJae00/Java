package Practice;

public class Lotto {

    public static void main(String[] args) {
        // 1 ~ 45 까지 번호 6번 뽑기
        int[] num = new int[6];
        for (int i = 0; i < 6; i++) {
            num[i] = (int) (Math.random() * 45) + 1;
            System.out.println(i + "번째 결과 : " + num[i]);
        }
    }
}
