package 行为型模式.模板方法模式;

public abstract class AbstractTemplate {

    public void templateMethod() {
        init();
        apply(); // 留给子类实现
        end();  // 可作为钩子函数
    }

    protected void init() {
        System.out.println("抽象基类已实现，子类可重写实现自己的逻辑。");
    }

    protected abstract void apply();

    protected void end() {

    }
}
