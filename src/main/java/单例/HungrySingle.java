package 单例;

/**
 * 饿汉式
 */
public class HungrySingle {

    //todo 1.构造器私有
    private HungrySingle() {

    }

    //一上来就创建可能会浪费空间
    private static final HungrySingle hungrySingle = new HungrySingle();

    public static HungrySingle getInstance() {
        return hungrySingle;
    }

}
