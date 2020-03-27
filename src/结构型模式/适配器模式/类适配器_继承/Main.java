package 结构型模式.适配器模式.类适配器_继承;

/**
 * 适配器模式三：通过继承适配不同的类
 */
public class Main {

    public static void main(String[] args) {
        AnimalAdaptor adaptor = new AnimalAdaptor();

        adaptor.eat();
        adaptor.walk();
        adaptor.fly();
    }
}
