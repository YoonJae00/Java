package chap08;

public class B extends OddDetector {
    public B(int n) {
        super(n);
    }

    @Override
    public boolean isOdd() {
        if(n % 2 == 1)
            return true;
        else return false;
    }

    public static void main(String[] args) {


        B b = new B(10);
        System.out.println(b.isOdd());


    }
}
