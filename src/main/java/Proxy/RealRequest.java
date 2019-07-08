package Proxy;

/**
 * @Classname RealRequest
 * @Description TODO
 * @Date 2019/7/8 23:01
 * @Created by huangdasheng
 */
/*真实*/
public class RealRequest implements Subject {
    public void request() {
        System.out.println("访问真实主题方法-------");
    }
}
