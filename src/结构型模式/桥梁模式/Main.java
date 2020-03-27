package 结构型模式.桥梁模式;

import 结构型模式.桥梁模式.draw.GreenPen;
import 结构型模式.桥梁模式.draw.RedPen;
import 结构型模式.桥梁模式.shape.Circle;
import 结构型模式.桥梁模式.shape.Rectangle;
import 结构型模式.桥梁模式.shape.Shape;

/**
 * 桥梁模式：对于有两个变化维度的系统，将抽象与实现分离开，使它们可以各自的独立变化。目的：把继承关系转成关联关系，解耦合。
 */
public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle(4, new GreenPen());
        Shape rectangle = new Rectangle(20 , 20, new RedPen());

        circle.draw();
        rectangle.draw();
    }
}
