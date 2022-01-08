package 适配器模式;

//适配器
public class Adapter extends Adaptee implements NetToUSB{

    @Override
    public void handleRequest() {
        super.request();
    }

}
