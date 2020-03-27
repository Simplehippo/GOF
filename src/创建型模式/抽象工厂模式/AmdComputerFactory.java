package 创建型模式.抽象工厂模式;

import 创建型模式.抽象工厂模式.entity.*;

public class AmdComputerFactory implements ComputerFactory {
    @Override
    public CPU makeCPU() {
        return new AmdCPU();
    }

    @Override
    public MainBoard makeMainBoard() {
        return new AmdMainBoard();
    }

    @Override
    public HardDisk makeHardDisk() {
        return new AmdHardDisk();
    }
}
