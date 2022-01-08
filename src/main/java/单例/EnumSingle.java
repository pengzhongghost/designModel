package 单例;

import java.lang.reflect.Constructor;

/**
 * 枚举是jdk1.5就有了，本身也是一个class类
 * 反射确实不能破坏枚举的单例
 * 枚举类型的最终反编译源码是一个有两个参数的构造方法
 */
public enum EnumSingle {

    INSTANCE;

    public EnumSingle getInstance() {
        return INSTANCE;
    }

}

class Test {
    public static void main(String[] args) throws Exception {
        EnumSingle instance01 = EnumSingle.INSTANCE;
        System.out.println(instance01);
        /**
         * Exception in thread "main" java.lang.NoSuchMethodException: 单例.EnumSingle.<init>()
         * 实际编译后的方法是有两个参数的方法
         * 最终此方法无法Cannot reflectively create enum objects
         */
        Constructor<EnumSingle> declaredConstructor = EnumSingle.class.getDeclaredConstructor(null);
        EnumSingle enumSingle = declaredConstructor.newInstance();
        System.out.println(enumSingle);
    }
}
