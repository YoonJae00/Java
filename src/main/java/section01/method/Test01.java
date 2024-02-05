package section01.method;

public class Test01 {

    public static void main(String[] args) {

        Test01 app1 = new Test01();
        app1.plus(10,10);

        app1.str("바보?",'바','보');

    }

    public void plus(int var1, int var2){
        int value = var1 + var2;
        System.out.println("value = " + value);
    }

    public void min(int var1, int var2){
        int value = var1 - var2;
        System.out.println("value = " + value);
    }

    public void multi(int var1, int var2){
        int value = var1 * var2;
        System.out.println("value = " + value);
    }

    public void div(int var1, int var2){
        int value = var1 / var2;
        System.out.println("value = " + value);
    }

    public void str(String str1, char str2 , char str3){

        System.out.println(str1 + "바보" + str2 + str3);

    }
}
