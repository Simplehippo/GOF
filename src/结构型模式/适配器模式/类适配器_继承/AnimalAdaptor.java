package 结构型模式.适配器模式.类适配器_继承;

public class AnimalAdaptor extends Bird implements Animal {
    @Override
    public void walk() {
        System.out.println("动物走路");
    }
}
