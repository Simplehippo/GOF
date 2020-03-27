package 创建型模式.抽象工厂模式.entity;

public class Computer {

    private CPU cpu;
    private MainBoard mainBoard;
    private HardDisk hardDisk;

    public Computer(CPU cpu, MainBoard mainBoard, HardDisk hardDisk) {
        this.cpu = cpu;
        this.mainBoard = mainBoard;
        this.hardDisk = hardDisk;
    }
}
