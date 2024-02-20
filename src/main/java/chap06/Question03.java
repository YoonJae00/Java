package chap06;

public class Question03 {
    public static void main(String[] args) {

        //- main() 메소드에서는 1978년, 스웨덴 국적의 ABBA가 부른 "Dancing Queen"을
        //song 객체로 생성하고 show()를 이용하여 노래의 정보를 다음과 같이 출력하라.
        //1978년 스웨덴국적의 ABBA가 부른 Dancing Queen
        Song artist1 = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
        artist1.show();

    }
}
