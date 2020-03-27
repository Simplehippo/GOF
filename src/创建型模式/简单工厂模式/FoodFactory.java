package 创建型模式.简单工厂模式;

import 创建型模式.简单工厂模式.entity.Chicken;
import 创建型模式.简单工厂模式.entity.Food;
import 创建型模式.简单工厂模式.entity.Noodle;

public class FoodFactory {

    public static Food makeFood(String name) {
        if ("noodle".equals(name)) {
            return new Noodle();
        } else if ("chicken".equals(name)) {
            return new Chicken();
        }

        return null;
    }
}
