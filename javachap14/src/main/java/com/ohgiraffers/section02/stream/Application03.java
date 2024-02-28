package com.ohgiraffers.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application03 {

    public static void main(String[] args) {

        // 수업목표. FileOutputStream 을 이해하고 사용할 수 있다.
        /* 필기.
            FileOutputStream
             프로그램의 데이터를 파일로 내보내기 위한 용도의 스트림이다.
             바이트 단위로 데이터를 저장한다.
         */
        FileOutputStream fo = null;
        try {
            fo = new FileOutputStream("src/main/java/com/ohgiraffers/section02/stream/testOutputStream.txt");
//            fo.write(97);

            // 10 : 개행문자 (엔터)
            byte[] barr = new byte[]{75, 85, 78, 71, 83, 10};
//            for(int i : barr){
//                fo.write(i);
//            }
            while (true) {
                fo.write(barr);
            }
            // 1번 인덱스부터 3의 길이만큼 파일에 내보내기
//            fo.write(barr, 1, 3);
        } catch (FileNotFoundException e) {
            System.out.println("오류발생!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fo != null) {
                try {
                    fo.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
