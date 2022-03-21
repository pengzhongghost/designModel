package 策略模式.improve;

public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("鸭子不会飞");
    }
}
