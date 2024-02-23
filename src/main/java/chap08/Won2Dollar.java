package chap08;

public class Won2Dollar extends Converter {

    public Won2Dollar(double ratio) {
        this.ratio = ratio;
    }       // 부모클래스 필드값은 그냥 접근 가능 !!! ( 물론 private 걸려있으면 안됨)

    @Override
    protected double convert(double src) {

        return src/ratio;
    }

    protected String getSrcString() {

        return "원";
    }

    @Override
    protected String getDestString() {
        return "달러";
    }


}
