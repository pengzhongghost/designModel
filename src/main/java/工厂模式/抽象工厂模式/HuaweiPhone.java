package 工厂模式.抽象工厂模式;

public class HuaweiPhone implements PhoneProduct{
    @Override
    public void start() {
        System.out.println("开启华为手机");
    }

}
