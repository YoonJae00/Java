package chap05;

import java.util.Scanner;

public class Question04 {

    public static void main(String[] args) {
        //사용자가 입력한 값이 배열에 있는지 검색하여 있으면 “OOO 치킨 배달 가능“,
        //없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요. 단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
        //ex. 치킨 이름을 입력하세요 : 양념
        //양념치킨 배달 가능
        //치킨 이름을 입력하세요 : 불닭
        //불닭치킨은 없는 메뉴입니다.
        String[] chicken = {"양념", "불닭", "뿌링클", "지코바", "황올", "황금올리브", "순살"};
        Scanner sc = new Scanner(System.in);
        System.out.print("치킨 이름을 입력하세요 : ");
        String name = sc.nextLine();
        int a = 0;
        for (int i = 0; i < chicken.length; i++) {
            if (name.equals(chicken[i])) {
                System.out.println(chicken[i] + " 배달가능");
                break;
            } else a++;
        }
        if (a == chicken.length) System.out.println("없는치킨 입니다.");
    }
}
