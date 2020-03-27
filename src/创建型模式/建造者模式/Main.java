package 创建型模式.建造者模式;

/**
 * 建造者模式：用于属性特别多的对象，可以实现链式调用。
 */
public class Main {

    public static void main(String[] args) {
        User user = User.builder()
                .name("name")
                .password("password")
                .age(18)
                .build();

        System.out.println(user.getName());
        System.out.println(user.getPassword());
        System.out.println(user.getAge());
    }
}
