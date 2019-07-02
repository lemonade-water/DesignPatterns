package Factory;

/**
 * @Classname FactoryA
 * @Description TODO
 * @Date 2019/7/2 22:57
 * @Created by huangdasheng
 */
/*实现工厂*/
public class FactoryA implements AbstractFactory {
    public Product newProduct() {
        return new ProductA();
    }
}
