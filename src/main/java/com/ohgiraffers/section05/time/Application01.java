package com.ohgiraffers.section05.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class Application01 {

    public static void main(String[] args) {

        // 수업목표. time 패키지에서 제공하는 클래스들의 사용 문법을 이해할 수 있다.

        /* 필기.
            time 이라는 패키지는 Date, Calendar 이것을 보완하여 탄생하였다.
            LocalTime, LocalDate,
         */

        LocalTime timenow = LocalTime.now();
        System.out.println("timenow = " + timenow);

        LocalDate dateNow = LocalDate.now();
        System.out.println("dateNow = " + dateNow);

        LocalDateTime dateTime = LocalDateTime.now();

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime = " + zonedDateTime);


    }
}
