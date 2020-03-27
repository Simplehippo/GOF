package 结构型模式.适配器模式.减负型适配器;

/**
 * 适配器模式一：可以减少实现不需要的接口方法，在事件监听中很常用。
 */
public class Main {

    public static void main(String[] args) {
        DoorListener doorListener = new DoorMonitor();

        doorListener.open();
        doorListener.close();
    }
}
