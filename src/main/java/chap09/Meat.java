package chap09;

public class Meat extends Menu{

    private boolean penFlag;

    public Meat(){}

    public Meat(String brand, String name, int price, boolean penFlag){

    }

    public boolean isPenFlag() {
        return penFlag;
    }

    public void setPenFlag(boolean penFlag) {
        this.penFlag = penFlag;
    }

    public void sell(int orderQuantity){
    }
}
