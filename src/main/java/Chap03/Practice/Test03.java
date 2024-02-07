package Chap03.Practice;

public class Test03 {

    public static void main(String[] args) {

        Test03 app1 = new Test03();
        app1.methodTest(3.3, 6);

    }

    public void methodTest(double a, int b) {

        int c = (int) a + b;
        System.out.println("c = " + c);

    }

}
