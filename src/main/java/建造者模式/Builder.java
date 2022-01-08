package 建造者模式;

/**
 * 抽象的建造者
 */
public abstract class Builder {

    /**
     * 建造房子的步骤 abcd
     */
    abstract void buildA();

    abstract void buildB();

    abstract void buildC();

    abstract void buildD();

    abstract Product getProduct();

}
