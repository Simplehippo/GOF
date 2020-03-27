package 结构型模式.桥梁模式.shape;

import 结构型模式.桥梁模式.draw.DrawAPI;

public class Circle extends Shape {

    private int radius;

    public Circle(int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.draw(radius, 0, 0);
    }
}
