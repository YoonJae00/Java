package chap06;

public class TV {

    private String brand;
    private int year;
    private int inch;

    public TV(){}

    public TV(String brand,int year,int inch){
        this.brand = brand;
        this.year = year;
        this.inch = inch;
    }

    public void show(){
        System.out.println(brand + "에서 만든" + year +"년형 " + inch + "인치 TV" );
    }

}
