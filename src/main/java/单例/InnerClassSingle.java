package 单例;

public class InnerClassSingle {

    private InnerClassSingle() {

    }

    public static InnerClassSingle getInstance() {
        return InnerClass.innerClassSingle;
    }

    public static class InnerClass {
        private static final InnerClassSingle innerClassSingle = new InnerClassSingle();
    }

}
