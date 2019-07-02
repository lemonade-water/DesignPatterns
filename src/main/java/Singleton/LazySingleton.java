package Singleton;

/**
 * @Classname LazySingleton
 * @Description TODO
 * @Date 2019/7/2 22:41
 * @Created by huangdasheng
 */
/*懒汉设计模式*/
//缺点：每次都访问都需要同步，会影响性能
public class LazySingleton{

    //volatile 在多线程下防止，线程安全问题！
    private static volatile LazySingleton lazySingleton = null;

    private LazySingleton(){}

    public static synchronized LazySingleton getInstance(){
        if(lazySingleton==null){
            return new LazySingleton();
        }else {
            return lazySingleton;
        }
    }
}
