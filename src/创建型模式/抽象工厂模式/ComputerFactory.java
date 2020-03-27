package 创建型模式.抽象工厂模式;

import 创建型模式.抽象工厂模式.entity.CPU;
import 创建型模式.抽象工厂模式.entity.HardDisk;
import 创建型模式.抽象工厂模式.entity.MainBoard;

public interface ComputerFactory {
    CPU makeCPU();
    MainBoard makeMainBoard();
    HardDisk makeHardDisk();
}
