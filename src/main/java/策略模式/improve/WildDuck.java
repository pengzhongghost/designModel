package 策略模式.improve;

public class WildDuck extends Duck {

    public WildDuck() {
        flyBehavior = new GoodFlyBehavior();
    }

    @Override
    void display() {
        System.out.println("这是一只野鸭");
    }

}
