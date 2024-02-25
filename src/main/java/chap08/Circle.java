package chap08;

class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public void draw() {
    }

    public void paint(){
        System.out.println("반지름 =" + radius);
    }
}
