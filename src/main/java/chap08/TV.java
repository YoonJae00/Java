package chap08;

public class TV implements Device {
    public static void main(String[] args) {
        TV myTV = new TV();
        myTV.on();
        myTV.watch();
        myTV.off();
    }

    @Override
    public void on() {
        System.out.println("켜짐");
    }

    @Override
    public void watch() {
        System.out.println("방송중");
    }

    @Override
    public void off() {
        System.out.println("종료");
    }
}
