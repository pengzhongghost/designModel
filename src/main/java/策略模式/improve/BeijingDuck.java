package 策略模式.improve;

public class BeijingDuck extends Duck {

    public BeijingDuck() {
        flyBehavior = new NoFlyBehavior();
    }

    @Override
    void display() {
        System.out.println("这是北京鸭");
    }

}
