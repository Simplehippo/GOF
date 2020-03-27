package 结构型模式.适配器模式.对象型适配器_组合;

public class WildCock implements Cock {
    @Override
    public void gobble() {
        System.out.println("鸡咕咕叫");
    }

    @Override
    public void fly() {
        System.out.println("鸡开始飞");
    }
}
