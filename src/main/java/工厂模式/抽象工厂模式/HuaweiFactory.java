package 工厂模式.抽象工厂模式;

public class HuaweiFactory implements ProductFactory{
    @Override
    public PhoneProduct phoneProduct() {
        return new HuaweiPhone();
    }

    @Override
    public RouterProduct routerProduct() {
        return new HuaweiRouter();
    }
}
