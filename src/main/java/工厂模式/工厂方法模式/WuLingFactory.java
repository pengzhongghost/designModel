package 工厂模式.工厂方法模式;

import 工厂模式.简单工厂.Car;
import 工厂模式.简单工厂.WuLing;

public class WuLingFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new WuLing();
    }
}
