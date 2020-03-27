package 创建型模式.工厂模式;

import 创建型模式.工厂模式.entity.ChineseFoodA;
import 创建型模式.工厂模式.entity.ChineseFoodB;
import 创建型模式.工厂模式.entity.Food;

public class ChineseFoodFactory implements FoodFactory {
    @Override
    public Food makeFood(String name) {
        if ("A".equals(name)) {
            return new ChineseFoodA();
        } else if ("B".equals(name)) {
            return new ChineseFoodB();
        }

        return null;
    }
}
