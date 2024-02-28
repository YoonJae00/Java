package chap06;

public class ProductTest {
    public static void main(String[] args) {

        Product data1 = new Product("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);

        System.out.println(data1.information());
        Product data2 = new Product("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);

        System.out.println(data2.information());
        Product data3 = new Product("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);

        System.out.println(data3.information());
        data1.setPrice(1200000);
        data2.setPrice(1200000);
        data3.setPrice(1200000);
        data1.setTax(0.05);
        data2.setTax(0.05);
        data3.setTax(0.05);
        System.out.println(data1.getPrice());
        System.out.println(data1.getTax());
        System.out.println(data2.getPrice());
        System.out.println(data2.getTax());
        System.out.println(data3.getPrice());
        System.out.println(data3.getTax());

        double realprice1 = data1.getPrice() + (data1.getPrice() * data1.getTax());
        double realprice2 = data2.getPrice() + (data2.getPrice() * data2.getTax());
        double realprice3 = data3.getPrice() + (data3.getPrice() * data3.getTax());
        System.out.println("상품명 : " + data1.getProductName());
        System.out.println("상품명 : " + data2.getProductName());
        System.out.println("상품명 : " + data3.getProductName());

        System.out.println("realprice1 = " + realprice1);
        System.out.println("realprice2 = " + realprice2);
        System.out.println("realprice3 = " + realprice3);

    }
}
