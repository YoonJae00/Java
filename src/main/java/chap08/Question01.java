package chap08;

public class Question01 {

    public static void main(String[] args) {

        Person[] students = new Student[3];
        students[0] = new Student("홍길동",20,178.2,70.0,1,"정보시스템공학과");
        students[1]  = new Student("김말똥",21,187.3,80.0,2,"경역학과");
        students[2]  = new Student("강개순",23,167.0,45.0,4,"정보통신공학과");

        students[0].setInfo();
        students[1].setInfo();
        students[2].setInfo();




    }
}
