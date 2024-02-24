package chap08;

public class PositivePoint extends Point {


    public PositivePoint(){

    }

    public PositivePoint(int x, int y) {

    }

    public void move(int x, int y) {
        if (x < 0 || y < 0){
            return;
        }else super.move(x,y);

    }

    public String toString() {
        return "(" + getX() + "," + getY() + ")";
    }
}
