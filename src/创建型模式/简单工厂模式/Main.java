package 创建型模式.简单工厂模式;

import 创建型模式.简单工厂模式.entity.Chicken;
import 创建型模式.简单工厂模式.entity.Food;
import 创建型模式.简单工厂模式.entity.Noodle;

/**
 * 简单工厂模式：根据参数的不同返回不同的对象。
 */
public class Main {

    public static void main(String[] args) {
        Food food = FoodFactory.makeFood("noodle");
        System.out.println(food);
    }
}
