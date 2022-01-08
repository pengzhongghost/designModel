package 代理模式.静态代理;

//房东
public class Landlord implements RentHouse{

    @Override
    public void rent() {
        System.out.println("房东要出租房子");
    }

}
