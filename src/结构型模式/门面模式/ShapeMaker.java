package 结构型模式.门面模式;

import 结构型模式.门面模式.shape.Circle;
import 结构型模式.门面模式.shape.Rectangle;
import 结构型模式.门面模式.shape.Shape;

public class ShapeMaker {

    private Shape circle;
    private Shape rectangle;

    public ShapeMaker() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
    }


    /**
     * 提供简单易用的访问入口
     */
    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }
}
