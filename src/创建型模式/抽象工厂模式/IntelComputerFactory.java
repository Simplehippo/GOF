package 创建型模式.抽象工厂模式;

import 创建型模式.抽象工厂模式.entity.*;

public class IntelComputerFactory implements ComputerFactory {
    @Override
    public CPU makeCPU() {
        return new IntelCPU();
    }

    @Override
    public MainBoard makeMainBoard() {
        return new IntelMainBoard();
    }

    @Override
    public HardDisk makeHardDisk() {
        return new IntelHardDisk();
    }
}
