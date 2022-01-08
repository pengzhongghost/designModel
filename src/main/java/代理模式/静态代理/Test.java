package 代理模式.静态代理;

public class Test {
    /**
     * 抽象角色，真实角色和代理角色
     */
    public static void main(String[] args) {
        RentHouse proxy = new Proxy();
        proxy.rent();
    }
}
