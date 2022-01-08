package 建造者模式;

//指挥，核心，负责指挥构建一个工程
public class Director {

    //指挥工人按顺序建造房子
    public Product build(Builder builder) {
        builder.buildA();
        builder.buildB();
        builder.buildC();
        builder.buildD();
        return builder.getProduct();
    }

}
