package 策略模式.improve;

public abstract class Duck {

    FlyBehavior flyBehavior;

    abstract void display();

    void quack() {
        System.out.println("鸭子嘎嘎叫");
    }

    void swim() {
        System.out.println("鸭子会游泳");
    }

    void fly() {
        //改进
        if (flyBehavior != null) {
            flyBehavior.fly();
        }
        //System.out.println("鸭子会飞");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
