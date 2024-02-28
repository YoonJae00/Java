package chap08;

abstract class OddDetector {
    protected int n;
    public OddDetector (int n) {
        this.n = n;
    }
    public abstract boolean isOdd(); // 홀수이면 true 리턴
}
