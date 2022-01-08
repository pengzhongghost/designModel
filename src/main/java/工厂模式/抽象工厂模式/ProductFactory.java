package 工厂模式.抽象工厂模式;

//抽象产品工厂
public interface ProductFactory {

    PhoneProduct phoneProduct();

    RouterProduct routerProduct();

}
