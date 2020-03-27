package 结构型模式.适配器模式.减负型适配器;

public class DoorMonitor extends DoorListenerAdaptor {

    @Override
    public void open() {
        System.out.println("开门");
    }

    @Override
    public void close() {
        System.out.println("关门");
    }
}
