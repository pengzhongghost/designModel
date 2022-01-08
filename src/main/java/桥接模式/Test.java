package 桥接模式;

public class Test {
    public static void main(String[] args) {
        //苹果笔记本
        Computer lapTop = new LapTop(new Apple());
        lapTop.info();
        //联想台式机
        Computer deskTop = new DeskTop(new Lenovo());
        deskTop.info();
    }
}
