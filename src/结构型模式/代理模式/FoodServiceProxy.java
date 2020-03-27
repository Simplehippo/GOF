package 结构型模式.代理模式;

import 结构型模式.代理模式.entity.Food;

public class FoodServiceProxy implements FoodService {

    private FoodService target;

    public FoodServiceProxy(FoodService target) {
        this.target = target;
    }

    @Override
    public Food makeNoodle() {
        System.out.println("我是代理，准备让被代理的对象制作面条");
        Food food = target.makeNoodle();
        System.out.println("被代理的对象制作面条成功：" + food);
        return food;
    }
}
