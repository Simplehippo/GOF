package 结构型模式.桥梁模式.shape;

import 结构型模式.桥梁模式.draw.DrawAPI;

public abstract class Shape {

    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
