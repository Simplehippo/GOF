package 结构型模式.适配器模式.对象型适配器_组合;

/**
 * 适配器模式二：使用组合把原来没有关系的两个类进行适配。
 */
public class Main {

    public static void main(String[] args) {
        Cock wildCock = new WildCock();
        Duck duck = new DuckAdaptor(wildCock);
        duck.quack();
    }
}
