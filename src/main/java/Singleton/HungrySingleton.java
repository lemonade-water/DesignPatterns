package Singleton;

/**
 * @Classname HungrySingleton
 * @Description TODO
 * @Date 2019/7/2 22:47
 * @Created by huangdasheng
 */
/*饿汉单例模式*/

public class HungrySingleton {
    private static final HungrySingleton hungrySingleton = new HungrySingleton();
    private HungrySingleton(){}
    public static synchronized HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
