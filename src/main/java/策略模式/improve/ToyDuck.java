package 策略模式.improve;

public class ToyDuck extends Duck {

    public ToyDuck() {
        flyBehavior = new NoFlyBehavior();
    }

    @Override
    void display() {
        System.out.println("这是一只玩具鸭");
    }

    @Override
    void quack() {
        System.out.println("玩具鸭不会叫");
    }

    @Override
    void swim() {
        System.out.println("玩具鸭不能游泳");
    }

}
