package 结构型模式.装饰器模式;

import 结构型模式.装饰器模式.decorator.Lemon;
import 结构型模式.装饰器模式.decorator.Mongo;

/**
 * 装饰器模式：类似于代理模式，都是对原始对象增强。
 * 与代理模式的区别点：装饰出来的对象可能会增强出新的方法，例如LineNumberInputStream会多出获取行号的方法，但也会导致损坏面向接口的模式。
 */
public class Main {

    public static void main(String[] args) {
        Beverage beverage = new GreenTea();

        beverage = new Lemon(beverage);
        beverage = new Lemon(beverage);
        beverage = new Mongo(beverage);

        System.out.println(beverage.getDescription() + " cost: " + beverage.cost());
    }
}
