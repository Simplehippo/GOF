package 结构型模式.享元模式;

/**
 * 享元模式：复用已生成的对象，可以简单理解为缓存。
 */
public class Main {

    public static void main(String[] args) {
        // 用字符串常量池作说明
        String str = "Flyweight";
        String str2 = "Flyweight";

        System.out.println(str == str2);
    }
}
