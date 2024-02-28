package Practice;

import java.util.Scanner;

import java.util.Scanner;

public class SubwayTime {
    public static void main(String[] args) {
        // 역간 이동 시간을 변수에 저장
        int AB = 10, BC = 4, CD = 2, DE = 5, EF = 12, FG = 3, GH = 7, HI = 8, IJ = 9, JA = 11;

        // 출발역과 도착역 입력 받기
        Scanner scanner = new Scanner(System.in);
        System.out.print("출발역을 입력하세요: ");
        String startStation = scanner.next(); // 공백을 포함하지 않는 문자열을 입력받음
        System.out.print("도착역을 입력하세요: ");
        String endStation = scanner.next(); // 공백을 포함하지 않는 문자열을 입력받음

        // 출발역과 도착역에 따른 이동 시간 계산
        int timeAB = Math.min(AB, JA); // A→B 방향
        int timeAJ = Math.min(JA, AB); // A→J 방향

        // 결과 출력
        if (startStation.charAt(0) == 'A') {
            if (endStation.charAt(0) == 'B') {
                System.out.println("A→B 방향으로 " + timeAB + "분 걸립니다.");
            } else if (endStation.charAt(0) == 'J') {
                System.out.println("A→J 방향으로 " + timeAJ + "분 걸립니다.");
            }
        } else if (startStation.charAt(0) == 'B') {
            if (endStation.charAt(0) == 'A') {
                System.out.println("B→A 방향으로 " + timeAB + "분 걸립니다.");
            } else if (endStation.charAt(0) == 'J') {
                System.out.println("B→J 방향으로 " + timeAB + "분 걸립니다.");
            }
        } else if (startStation.charAt(0) == 'J') {
            if (endStation.charAt(0) == 'A') {
                System.out.println("J→A 방향으로 " + timeAJ + "분 걸립니다.");
            } else if (endStation.charAt(0) == 'B') {
                System.out.println("J→B 방향으로 " + timeAJ + "분 걸립니다.");
            }
        }

        // Scanner 닫기
        scanner.close();
    }
}



