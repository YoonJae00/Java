package Chap03.Practice;

public class Test04 {

    public static void main(String[] args) {

        System.out.println("main() 시작함...");
        Test04 app = new Test04();
        app.methodA();
        app.methodB();
        app.methodC();
        System.out.println("main() 종료됨...");
    }

    public void methodA() {
        System.out.println("methodA() 호출됨...");
        methodB();
        System.out.println("methodA() 종료됨...");
    }

    public void methodB() {
        System.out.println("methodB() 호출됨...");
        System.out.println("methodB() 종료됨...");
    }

    public void methodC() {
        System.out.println("methodC() 호출됨...");
        methodA();
        System.out.println("methodC() 종료됨...");
    }
}