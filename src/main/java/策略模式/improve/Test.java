package 策略模式.improve;

public class Test {
    public static void main(String[] args) {
        ToyDuck toyDuck = new ToyDuck();
        toyDuck.fly();
        toyDuck.setFlyBehavior(new GoodFlyBehavior());
        toyDuck.fly();
    }
}
