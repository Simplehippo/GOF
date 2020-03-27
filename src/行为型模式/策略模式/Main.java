package 行为型模式.策略模式;

/**
 * 策略模式：与面向接口的多态思想基本一致，区别在于需要有能执行策略的Context主体，侧重点在Context主体上。
 */
public class Main {

    public static void main(String[] args) {
        Strategy strategy = new GreenPen();
        Context context = new Context(strategy);

        context.executeDraw(0, 0, 0);
    }
}
