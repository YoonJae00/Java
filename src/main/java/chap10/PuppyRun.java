package chap10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PuppyRun {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        List<Dog> AL = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            System.out.print(i + "번째 강쥐 이름 입력 : ");
            String name = sc.nextLine();
            System.out.print(i + "번째 강쥐 나이 입력 : ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print(i + "번째 강쥐 종 입력 : ");
            String kind = sc.nextLine();
            AL.add(new Dog(name, age, kind));
        }
        System.out.print(4 + "번째 강쥐 이름 입력 : ");
        String name1 = sc.nextLine();
        System.out.print(4 + "번째 강쥐 나이 입력 : ");
        int age1 = sc.nextInt();
        sc.nextLine();
        System.out.print(4 + "번째 강쥐 종 입력 : ");
        String kind1 = sc.nextLine();
        AL.add(2, new Dog(name1, age1, kind1));

        System.out.println("======= 전체 강쥐 출력 ======");
        for (int i = 0; i < AL.size(); i++) {
            System.out.println(AL.get(i));
        }
        System.out.println("===========================");

        // 구 포함한 강아지가 몇마리인지 출력

        String[] arrname = new String[5];
        for (int i = 0; i < 5; i++) {
            arrname[i] = AL.get(i).getName();
        }
        int num = 0;
        for (int i = 0; i < arrname.length; i++) {
            for (int j = 0; j < arrname[i].length(); j++) {
                if (arrname[i].charAt(j) == '구') {
                    System.out.println(arrname[i]);
                    num++;
                }
            }
        }

        System.out.println("총 마리 " + num);
    }
}
