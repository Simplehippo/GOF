package 行为型模式.策略模式;

public class RedPen implements Strategy {
    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("红色的笔");
    }
}
