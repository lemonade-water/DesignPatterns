package Builder;

/**
 * @Classname Director
 * @Description TODO
 * @Date 2019/7/4 22:15
 * @Created by huangdasheng
 */
public class Director {
    private Builder builder;
    public Director(Builder builder)
    {
        this.builder=builder;
    }
    //产品构建与组装方法
    public Product construct()
    {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
