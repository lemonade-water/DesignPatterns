package Factory;

import java.sql.PreparedStatement;

/**
 * @Classname ProductA
 * @Description TODO
 * @Date 2019/7/2 22:59
 * @Created by huangdasheng
 */
public class ProductA implements Product {
    public void show() {
        System.out.println("This is ProductA");
    }
}
