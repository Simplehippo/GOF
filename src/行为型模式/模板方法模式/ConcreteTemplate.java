package 行为型模式.模板方法模式;

public class ConcreteTemplate extends AbstractTemplate {
    @Override
    public void apply() {
        System.out.println("子类实现 apply 方法。");
    }

    @Override
    public void end() {
        System.out.println("子类实现钩子方法。。");
    }
}
