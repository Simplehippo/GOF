package 结构型模式.桥梁模式.draw;

public class GreenPen implements DrawAPI {
    @Override
    public void draw(int radius, int x, int y) {
        System.out.println(String.format("使用绿色的笔, radius:%d, x:%d, y:%d", radius, x, y));
    }
}
