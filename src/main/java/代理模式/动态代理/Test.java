package 代理模式.动态代理;

import 代理模式.静态代理.Landlord;
import 代理模式.静态代理.RentHouse;

public class Test {

    public static void main(String[] args) {
        //真实角色
        Landlord landlord = new Landlord();
        //代理角色
        ProxyInvocationHandler proxy = new ProxyInvocationHandler(landlord);
        RentHouse rentHouse = proxy.getProxy();
        rentHouse.rent();
    }

}
