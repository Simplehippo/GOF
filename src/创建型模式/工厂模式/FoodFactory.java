package 创建型模式.工厂模式;

import 创建型模式.工厂模式.entity.Food;

public interface FoodFactory {
    Food makeFood(String name);
}
