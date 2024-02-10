package Practice;

import java.util.Scanner;

public class Dicegame {

    public static void main(String[] args) {
        // 주사위 게임 사람수만큼 주사위 굴려 큰수 나오는 사람이 승리

        Scanner sc = new Scanner(System.in);
        System.out.print("사람 수를 선택하세요 : ");
        int num = sc.nextInt();
        sc.nextLine();

        switch (num){
            case 1 :
                System.out.println("혼자 주사위를 왜 굴리시나요..??");
            case 2 :
                System.out.print("1번 사람 입력 : ");
                String user1 = sc.nextLine();
                System.out.print("2번 사람 입력 : ");
                String user2 = sc.nextLine();
                int dice1 = (int)(Math.random()*6)+1;
                int dice2 = (int)(Math.random()*6)+1;
                if(dice1 > dice2){
                    System.out.println(user1 + "님이 승리하셨습니다!");
                }else if (dice1 < dice2){
                    System.out.println(user2 + "님이 승리하셨습니다!");
                }else {
                    System.out.println("비겼습니다!");
                }

        }


    }

}
