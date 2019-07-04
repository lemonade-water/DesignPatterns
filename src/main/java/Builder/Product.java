package Builder;

/**
 * @Classname Product
 * @Description TODO
 * @Date 2019/7/4 22:02
 * @Created by huangdasheng
 */
public class Product {
    private String partA;
    private String partB;
    private String partC;

    public void show()
    {
        //显示产品的特性
        System.out.println(this.partA);
        System.out.println(this.partB);
        System.out.println(this.partC);
    }

    public String getPartA() {
        return partA;
    }

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public String getPartB() {
        return partB;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public String getPartC() {
        return partC;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }
}
