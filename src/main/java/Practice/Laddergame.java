package Practice;

import java.util.*;

public class Laddergame {
    public static List<Integer> values = new ArrayList<>();
    private static List<Integer> getRandomSet(int cnt) {
        int randomNum = (int) (Math.random() * cnt) + 1;

        if (!values.contains(randomNum)) values.add(randomNum);

        if (values.size() == cnt) return values;
        else return getRandomSet(cnt);
    }

    public static void main(String[] args) {
        // 사다리게임
        Scanner sc = new Scanner(System.in);
        System.out.print("사용자의 수를 입력하세요 : ");
        int num = sc.nextInt();
        sc.nextLine();
        List<String> users = new ArrayList<String>();
        List<String> results = new ArrayList<String>();
        int i = 1;

        while(i <= num) {
            System.out.print("사용자" + i + " 입력 : ");
            users.add(sc.nextLine());
            i++;
        }

        i = 1;
        while(i <= num) {
            System.out.print("당첨항목" + i + " 입력 : ");
            results.add(sc.nextLine());
            i++;
        }

        List<Integer> randomResult = Laddergame.getRandomSet(num);

        final int[] test = {0};
        randomResult.forEach(randomNum -> System.out.println(users.get(test[0]++) + "님은 " + results.get(randomNum - 1) + " 입니다"));
    }
}
