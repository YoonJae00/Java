package com.ohgiraffers.section05.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Application02 {

    public static void main(String[] args) {

        // 수업목표. time 패키지의 클래스들에 포매팅을 적용하여 출력할 수 있다.

        String timeNow = "15:00:00";
        String dateNow = "2024-02-23";

        LocalTime localTime = LocalTime.parse(timeNow);
        LocalDate localDate = LocalDate.parse(dateNow);

        System.out.println("localTime = " + localTime);
        System.out.println("localDate = " + localDate);

        String timeNow2 = "15-05-01";
        String dateNow2 = "240223";

        LocalTime localTime2 = LocalTime.parse(timeNow2, DateTimeFormatter.ofPattern("HH-mm-ss"));
        System.out.println("localTime2 = " + localTime2);
        LocalDate localDate2 = LocalDate.parse(dateNow2, DateTimeFormatter.ofPattern("yyMMdd"));
        System.out.println("localDate2 = " + localDate2);

        String dateFormat = localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("dateFormat = " + dateFormat);



    }
}
