package chap06;

public class Add {
    private int a;
    private int b;


    public Add() {}

    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculate(){ return a + b;}
}