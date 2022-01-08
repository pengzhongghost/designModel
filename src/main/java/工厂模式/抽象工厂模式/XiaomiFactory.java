package 工厂模式.抽象工厂模式;

public class XiaomiFactory implements ProductFactory {
    @Override
    public PhoneProduct phoneProduct() {
        return new XiaomiPhone();
    }

    @Override
    public RouterProduct routerProduct() {
        return new XiaomiRouter();
    }
}
