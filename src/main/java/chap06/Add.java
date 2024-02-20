package chap06;

public class Add {
    private int a;
    private int b;


    public Add() {
    }

    public Add(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void setValue(int a, int b) {
        System.out.println(" a + b : " + a + b);
    }
}
