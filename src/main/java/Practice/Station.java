package Practice;

import java.util.Scanner;


public class Station {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("출발지를 입력하세요 : ");
        char start = sc.nextLine().charAt(0);
        System.out.print("도착지를 입력하세요 : ");
        char arrive = sc.nextLine().charAt(0);

        Station app1 = new Station();
        int SB = Math.abs(app1.startB(start,arrive));
        int SJ = Math.abs(app1.startJ(start,arrive));

        if(SB>SJ) System.out.println("걸리는 시간은" + SJ +" 분입니다");
        else System.out.println("걸리는 시간은 " + SB +" 분입니다");

    }


    public int startB(char start , char arrive){
        int timeFirst = 0;
        int timeFinal = 0;
        switch(start){ // B E 11
            case 'A' :  timeFinal += 10;
            case 'B' :  timeFinal += 4;
            case 'C' :  timeFinal += 2;
            case 'D' :  timeFinal += 5;
            case 'E' :  timeFinal += 12;
            case 'F' :  timeFinal += 3;
            case 'G' :  timeFinal += 7;
            case 'H' :  timeFinal += 8;
            case 'I' :  timeFinal += 9;
            case 'J' :  timeFinal += 11;
        }
        switch(arrive){
            case 'A' :  timeFirst += 10;
            case 'B' :  timeFirst += 4;
            case 'C' :  timeFirst += 2;
            case 'D' :  timeFirst += 5;
            case 'E' :  timeFirst += 12;
            case 'F' :  timeFirst += 3;
            case 'G' :  timeFirst += 7;
            case 'H' :  timeFirst += 8;
            case 'I' :  timeFirst += 9;
            case 'J' :  timeFirst += 11;
        }
        int result =  timeFirst - timeFinal;

        return result;
    }

    public int startJ(char start , char arrive){
        int timeFirst = 0;
        int timeFinal = 0;
        switch(start){ // C 에서 J
            case 'J' :  timeFirst += 11;
            case 'I' :  timeFirst += 9;
            case 'H' :  timeFirst += 8;
            case 'G' :  timeFirst += 7;
            case 'F' :  timeFirst += 3;
            case 'E' :  timeFirst += 12;
            case 'D' :  timeFirst += 5;
            case 'C' :  timeFirst += 2;
            case 'B' :  timeFirst += 4;
            case 'A' :  timeFirst += 10;
        }
        switch(arrive){
            case 'J' :  timeFirst += 11;
            case 'I' :  timeFirst += 9;
            case 'H' :  timeFirst += 8;
            case 'G' :  timeFirst += 7;
            case 'F' :  timeFirst += 3;
            case 'E' :  timeFirst += 12;
            case 'D' :  timeFirst += 5;
            case 'C' :  timeFirst += 2;
            case 'B' :  timeFirst += 4;
            case 'A' :  timeFirst += 10;
        }
        int result =  timeFinal - timeFirst;
        return result;
    }
}
