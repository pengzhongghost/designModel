package 桥接模式;

public class Apple implements Brand {
    @Override
    public void info() {
        System.out.println("苹果");
    }
}
