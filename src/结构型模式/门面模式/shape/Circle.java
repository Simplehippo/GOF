package 结构型模式.门面模式.shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("画圆");
    }
}
