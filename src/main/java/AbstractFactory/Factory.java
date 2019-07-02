package AbstractFactory;

/**
 * @Classname Factory
 * @Description TODO
 * @Date 2019/7/2 23:19
 * @Created by huangdasheng
 */
public class Factory implements AbstractFactory {
    public Product createProductA() {
        return new ProductA();
    }

    public Product createProductB() {
        return new ProductB();
    }
}
