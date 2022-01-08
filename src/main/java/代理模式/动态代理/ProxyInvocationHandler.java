package 代理模式.动态代理;

import 代理模式.静态代理.RentHouse;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    private RentHouse rentHouse;

    public ProxyInvocationHandler(RentHouse rentHouse) {
        this.rentHouse = rentHouse;
    }

    public RentHouse getProxy() {
        return (RentHouse) Proxy.newProxyInstance(this.getClass().getClassLoader(), rentHouse.getClass().getInterfaces(), this);
    }

    //处理代理实例
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置方法");
        Object result = method.invoke(rentHouse, args);
        System.out.println("后置方法");
        return result;
    }
}
