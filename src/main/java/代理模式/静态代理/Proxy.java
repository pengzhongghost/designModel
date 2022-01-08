package 代理模式.静态代理;

public class Proxy implements RentHouse{

    private Landlord landlord;

    public Proxy() {
        this.landlord = new Landlord();
    }

    @Override
    public void rent() {
        landlord.rent();
    }
}
