package 结构型模式.代理模式;

import 结构型模式.代理模式.entity.Food;
import 结构型模式.代理模式.entity.Noodle;

public class FoodServiceImpl implements FoodService {
    @Override
    public Food makeNoodle() {
        return new Noodle();
    }
}
