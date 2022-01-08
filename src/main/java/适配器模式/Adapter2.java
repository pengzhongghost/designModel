package 适配器模式;

//适配器，转换器
public class Adapter2 implements NetToUSB{

    private Adaptee adaptee;

    public Adapter2() {
        this.adaptee = new Adaptee();
    }

    @Override
    public void handleRequest() {
        System.out.println("上网");
    }
}
