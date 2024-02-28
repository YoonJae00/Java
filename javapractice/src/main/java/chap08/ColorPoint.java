package chap08;

public class ColorPoint extends Point {


    private String color = "BLACK";

    public ColorPoint() {

    }

    public ColorPoint(int x, int y) {
        super(x, y);
    }

    public void setXY(int x, int y) {
        super.move(x, y);
    }

    public void setColor(String color){
        this.color = color;
    }

    public String toString(){

        return color + "색의" + getX() + "," + getY();
    }
}
