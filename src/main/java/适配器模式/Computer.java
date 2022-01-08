package 适配器模式;

//客户端类，想上网，插不上网线
public class Computer {

    public void net(NetToUSB adapter){
       adapter.handleRequest();
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        //网线
        Adaptee adaptee = new Adaptee();
        //转接器
        Adapter adapter = new Adapter();
        computer.net(adapter);
        Adapter2 adapter2 = new Adapter2();
        computer.net(adapter2);
    }

}
