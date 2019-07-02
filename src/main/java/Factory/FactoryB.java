package Factory;

/**
 * @Classname FactoryB
 * @Description TODO
 * @Date 2019/7/2 22:58
 * @Created by huangdasheng
 */
/*实现工厂B*/
public class FactoryB implements AbstractFactory {
    public Product newProduct() {
        return new ProductB();
    }
}
