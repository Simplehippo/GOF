package 结构型模式.桥梁模式.shape;

import 结构型模式.桥梁模式.draw.DrawAPI;

public class Rectangle extends Shape {

    private int x;
    private int y;

    public Rectangle(int x, int y, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawAPI.draw(0, x, y);
    }
}
