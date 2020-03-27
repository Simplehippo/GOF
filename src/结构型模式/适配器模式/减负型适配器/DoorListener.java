package 结构型模式.适配器模式.减负型适配器;

public interface DoorListener {
    void open();
    void close();
    void beep();
    void doorbellRing();
    void doorbellStop();
}
