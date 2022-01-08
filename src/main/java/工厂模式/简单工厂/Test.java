package 工厂模式.简单工厂;

public class Test {

    public static void main(String[] args) {
        Car car = CarFactory.getCar("五菱宏光");
        System.out.println(car);
    }

}
