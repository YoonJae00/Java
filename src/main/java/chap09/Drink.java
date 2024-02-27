package chap09;

public class Drink extends Menu{

    private int size;

    public Drink(){
        super();
    }

    Drink(int size){
        super();
        this.size = size;
    }

    Drink(String name,int price, int size){
        super(name,price);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void sell(int orderQuantity){

    }

}
