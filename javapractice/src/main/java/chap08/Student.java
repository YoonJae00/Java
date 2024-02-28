package chap08;

public class Student extends Person {

    private int grade;
    private String major;

    public Student() {}

    public Student(String name,int age, double height, double weight, int grade, String major){
        super(name,age,height,weight);
        this.grade = grade;
        this.major = major;
    }

    @Override
    public void setInfo(){
        System.out.println();
    }

}
