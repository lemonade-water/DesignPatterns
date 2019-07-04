package Builder;

/**
 * @Classname Client
 * @Description TODO
 * @Date 2019/7/4 22:16
 * @Created by huangdasheng
 */
public class Client {
    public static void main(String[] args)
    {
        Builder builder=new ConcreteBuilder();
        Director director=new Director(builder);
        Product product=director.construct();
        product.show();
    }
}
