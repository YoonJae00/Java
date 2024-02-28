package chap09;

public class StringStack implements Stack{


    private int num;

    @Override
    public int length() {
        return 0;
    }

    public int length(int num){
        this.num = num;
        return num;
    }

    @Override
    public int capacity() {
        num--;
        return num;
    }

    @Override
    public String pop() {
        return null;
    }

    @Override
    public boolean push(String val) {
        return false;
    }
}
