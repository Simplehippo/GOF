package 结构型模式.装饰器模式;

public class GreenTea implements Beverage {
    @Override
    public String getDescription() {
        return "绿茶";
    }

    @Override
    public double cost() {
        return 10;
    }
}
