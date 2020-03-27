package 结构型模式.门面模式;

/**
 * 门面模式：解决不同实现的差异性，对外提供统一的访问入口，例如 slf4j日志 体系。
 */
public class Main {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
    }
}
