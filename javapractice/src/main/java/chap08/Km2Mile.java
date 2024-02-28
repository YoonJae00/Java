package chap08;

public class Km2Mile extends Converter {
    private double km;
    public Km2Mile(double km){
        ratio = km;
    }
    @Override
    protected double convert(double src) {
        return src / ratio ;
    }

    @Override
    protected String getSrcString() {
        return "km";
    }

    @Override
    protected String getDestString() {
        return "mile";
    }
}
