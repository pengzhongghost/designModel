package 工厂模式.简单工厂;

/**
 * 简单工厂模式（静态工厂模式）
 * 弊端：增加一个新的，不修改原代码的话做不到
 */
public class CarFactory {

    //方法一
    public static Car getCar(String car) {
        if (car.equals("五菱宏光")) {
            return new WuLing();
        } else if (car.equals("特斯拉")) {
            return new Tesla();
        } else {
            return null;
        }
    }

}
