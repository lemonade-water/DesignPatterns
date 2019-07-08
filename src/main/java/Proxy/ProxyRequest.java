package Proxy;

/**
 * @Classname ProxyRequest
 * @Description TODO
 * @Date 2019/7/8 23:03
 * @Created by huangdasheng
 */
public class ProxyRequest implements Subject {
    private RealRequest realRequest =new RealRequest();
    public void request() {
        realRequest.request();
    }
}
