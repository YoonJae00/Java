package chap08;

public abstract class Person {

    private String name;
    private int age;
    private double height;
    private double weight;

    public Person() {
    }

    public Person(String name,int age, double height, double weight) {
        this.age = age;
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setInfo() {}
}
