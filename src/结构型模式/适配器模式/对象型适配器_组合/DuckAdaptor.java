package 结构型模式.适配器模式.对象型适配器_组合;

public class DuckAdaptor implements Duck {

    private Cock cock;

    public DuckAdaptor(Cock cock) {
        this.cock = cock;
    }

    @Override
    public void quack() {
        cock.gobble();
    }

    @Override
    public void fly() {
        cock.fly();
    }
}
