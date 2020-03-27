package 结构型模式.装饰器模式.decorator;

import 结构型模式.装饰器模式.Beverage;

public class Mongo implements Condiment {
    private Beverage beverage;

    public Mongo(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "+芒果";
    }

    @Override
    public double cost() {
        return beverage.cost() + 10;
    }
}
