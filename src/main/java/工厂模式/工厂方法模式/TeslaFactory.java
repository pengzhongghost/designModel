package 工厂模式.工厂方法模式;

import 工厂模式.简单工厂.Car;
import 工厂模式.简单工厂.Tesla;

public class TeslaFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Tesla();
    }
}
