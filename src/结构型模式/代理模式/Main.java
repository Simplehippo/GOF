package 结构型模式.代理模式;

/**
 * 代理模式：目的是在被代理对象执行业务逻辑的前后做一些操作, 简而言之：方法增强。
 */
public class Main {

    public static void main(String[] args) {
        // 静态代理，想了解动态代理可自行查找资料
        FoodService target = new FoodServiceImpl();
        FoodService foodService = new FoodServiceProxy(target);
        foodService.makeNoodle();
    }
}