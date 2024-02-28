package chap06;

import org.w3c.dom.css.Rect;

public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle() {
    }

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

    }

    public int square() {

        return x * y;
    }

    public void show() {

        System.out.println("사각형의 넓이는 : " + square() + "입니다.");
    }
    boolean contations(Rectangle r){

        return true;
    }
}
