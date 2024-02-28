package Chap03.Practice;

import static java.lang.Math.PI;

public class Test05 {

    public static void main(String[] args) {

        //Q: 원의 둘레와 넓이를 반환하는 메소드를 각각 만들어 보자
        // radius = 반지름
        //
        Test05 app = new Test05();


        System.out.println(app.circlePerimeter(10,PI));
        System.out.println(app.circleArea(10,PI));
    }
    public double circlePerimeter(double radius,double PI){

        return radius*2*PI;
    }
    public double circleArea(double radius,double PI){

        return radius*radius*PI;
    }
}
