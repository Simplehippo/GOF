package 创建型模式.工厂模式;

import 创建型模式.工厂模式.entity.AmericanFoodA;
import 创建型模式.工厂模式.entity.AmericanFoodB;
import 创建型模式.工厂模式.entity.Food;

public class AmericanFoodFactory implements FoodFactory {
    @Override
    public Food makeFood(String name) {
        if ("A".equals(name)) {
            return new AmericanFoodA();
        } else if ("B".equals(name)) {
            return new AmericanFoodB();
        }

        return null;
    }
}
