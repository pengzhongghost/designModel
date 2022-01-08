package 工厂模式.抽象工厂模式;

public class HuaweiRouter implements RouterProduct {
    @Override
    public void start() {
        System.out.println("华为路由器启动");
    }
}
