package 创建型模式.单例模式.静态内部类;

public class Singleton {

    private Singleton() {

    }

    private static class SingletonHolder {
        private static Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }
}
