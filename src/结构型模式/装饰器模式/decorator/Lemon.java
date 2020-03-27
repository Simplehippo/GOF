package 结构型模式.装饰器模式.decorator;

import 结构型模式.装饰器模式.Beverage;

public class Lemon implements Condiment {

    private Beverage beverage;

    public Lemon(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "+柠檬";
    }

    @Override
    public double cost() {
        return beverage.cost() + 2;
    }
}
