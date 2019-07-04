package Builder;

/**
 * @Classname Builder
 * @Description TODO
 * @Date 2019/7/4 22:14
 * @Created by huangdasheng
 */
public abstract class Builder {
    //创建产品对象
    protected Product product=new Product();
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();
    //返回产品对象
    public Product getResult()
    {
        return product;
    }
}
