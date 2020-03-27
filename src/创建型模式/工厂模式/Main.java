package 创建型模式.工厂模式;

import 创建型模式.工厂模式.entity.ChineseFoodA;
import 创建型模式.工厂模式.entity.Food;

/**
 * 工厂模式：首先选择需要的工厂，之后与简单工厂模式基本一致。
 */
public class Main {

    public static void main(String[] args) {
        FoodFactory foodFactory = new ChineseFoodFactory();
        Food food = foodFactory.makeFood("A");
        System.out.println(food);
    }
}
