package 创建型模式.原型模式;

/**
 * 原型模式：基于一个原型实例创建出一个新的实例，克隆就是原型模式的一种。
 */
public class Main {

    public static void main(String[] args) throws Exception {
        // 这里只演示浅克隆用来描述原型模式，想深入了解Java的克隆机制可以百度->Java深克隆
        User user = new User("test", 1);
        User cloneUser = user.clone();

        System.out.println(cloneUser.getName());
        System.out.println(cloneUser.getAge());
    }
}
