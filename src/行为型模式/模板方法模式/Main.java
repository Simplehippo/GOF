package 行为型模式.模板方法模式;

/**
 * 模板方法模式：由抽象的父类定义好执行的规则(例如执行顺序，条件等)，具体的逻辑由子类实现。
 */
public class Main {

    public static void main(String[] args) {
        AbstractTemplate template = new ConcreteTemplate();
        template.templateMethod();
    }
}
