package 建造者模式;

public class Test {

    public static void main(String[] args) {
        Director director = new Director();
        Product product = director.build(new Worker());
        System.out.println(product);
    }

}
