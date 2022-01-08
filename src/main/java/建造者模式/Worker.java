package 建造者模式;

//具体的建造者
public class Worker extends Builder {

    private Product product;

    public Worker() {
        this.product = new Product();
    }

    @Override
    void buildA() {
        product.setA("地基");
    }

    @Override
    void buildB() {
        product.setB("钢筋");
    }

    @Override
    void buildC() {
        product.setC("电线");
    }

    @Override
    void buildD() {
        product.setD("粉刷");
    }

    @Override
    Product getProduct() {
        return product;
    }
}
