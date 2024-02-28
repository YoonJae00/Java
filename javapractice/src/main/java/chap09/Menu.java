package chap09;

public abstract class Menu implements Restaurant{


    private String name;
    private int price;

    public Menu(){}


    public Menu(String name, int price){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void Restaurant() {

    }

    @Override
    public void Restaurant(String name, int price) {

    }

    @Override
    public void sell(int orderQuantity) {

    }
}
