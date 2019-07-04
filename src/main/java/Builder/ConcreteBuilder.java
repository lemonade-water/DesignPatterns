package Builder;

/**
 * @Classname ConcreteBuilder
 * @Description TODO
 * @Date 2019/7/4 22:15
 * @Created by huangdasheng
 */
public class ConcreteBuilder extends Builder {
    public void buildPartA() {
        product.setPartA("建造 PartA");
    }

    public void buildPartB() {
        product.setPartB("建造 PartB");
    }

    public void buildPartC() {
        product.setPartC("建造 PartC");
    }
}
