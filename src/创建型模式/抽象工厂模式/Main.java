package 创建型模式.抽象工厂模式;

import 创建型模式.抽象工厂模式.entity.CPU;
import 创建型模式.抽象工厂模式.entity.Computer;
import 创建型模式.抽象工厂模式.entity.HardDisk;
import 创建型模式.抽象工厂模式.entity.MainBoard;

/**
 * 抽象工厂模式：涉及到产品族时采用，为了兼容性牺牲了扩展性。
 */
public class Main {

    public static void main(String[] args) {
        ComputerFactory computerFactory = new IntelComputerFactory();

        CPU cpu = computerFactory.makeCPU();
        MainBoard mainBoard = computerFactory.makeMainBoard();
        HardDisk hardDisk = computerFactory.makeHardDisk();

        Computer computer = new Computer(cpu, mainBoard, hardDisk);

        System.out.println(cpu);
        System.out.println(mainBoard);
        System.out.println(hardDisk);
        System.out.println(computer);
    }
}
