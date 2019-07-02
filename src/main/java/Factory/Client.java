package Factory;

/**
 * @Classname Client
 * @Description TODO
 * @Date 2019/7/2 23:04
 * @Created by huangdasheng
 */
public class Client {
    public static void main(String[] args) {

        AbstractFactory factoryA = new FactoryA();
        Product productA = factoryA.newProduct();
        productA.show();

        AbstractFactory factoryB = new FactoryB();
        Product productB = factoryB.newProduct();
        productB.show();
    }
}
