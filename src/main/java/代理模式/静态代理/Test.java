package 代理模式.静态代理;

public class Test {
    /**
     * 静态代理：一个真实角色只会生成一个代理角色；代码量会翻倍--开发效率变低
     * 抽象角色，真实角色和代理角色
     */
    public static void main(String[] args) {
        RentHouse proxy = new Proxy();
        proxy.rent();
    }
}
