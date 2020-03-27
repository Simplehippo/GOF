package 结构型模式.装饰器模式;

public class RedTea implements Beverage {
    @Override
    public String getDescription() {
        return "红茶";
    }

    @Override
    public double cost() {
        return 20;
    }
}
