package 单例;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * 懒汉式
 */
public class LazySIngle {

    private static boolean flag = false;

    private LazySIngle() {
        //TODO 防止使用反射创建对象
        synchronized (LazySIngle.class) {
            //解决不是同时创建的对象
            if (!flag) {
                flag = true;
            } else
                //解决同时创建一个对象
                if (lazySIngle != null) {
                    throw new RuntimeException("不要试图用反射破坏异常");
                }
        }
    }

    //TODO 确保不能指令重排
    //     对象不为null，但是初始化还没完毕
    private volatile static LazySIngle lazySIngle;

    //只有调用的时候才去创建对象
    public static LazySIngle getInstance() {
        if (lazySIngle == null) {
            lazySIngle = new LazySIngle();
        }
        return lazySIngle;
    }

    //双重锁模式 DCL懒汉式
    public static LazySIngle getSafeInstance() {
        if (lazySIngle == null) {
            synchronized (LazySIngle.class) {
                if (lazySIngle == null) {
                    //TODO 不是原子性操作
                    /**
                     * 1.分配内存空间
                     * 2.执行构造方法，初始化对象
                     * 3.把这个对象指向这个空间
                     *
                     * 可能发生指令重排
                     * 123
                     * 132
                     * 线程A
                     * 线程B 可能认为lazyman还没有完成构造,指向了一片虚无
                     */
                    lazySIngle = new LazySIngle();
                }
            }
        }
        return lazySIngle;
    }

    /**
     * 反射可以破坏
     * @param args
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws NoSuchFieldException
     */
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        LazySIngle instance = LazySIngle.getSafeInstance();
        System.out.println(instance);
        Field field = instance.getClass().getDeclaredField("flag");
        field.set(instance, false);
        Constructor<LazySIngle> declaredConstructor = LazySIngle.class.getDeclaredConstructor(null);
        LazySIngle lazySIngle = declaredConstructor.newInstance();
        System.out.println(lazySIngle);
    }

}
