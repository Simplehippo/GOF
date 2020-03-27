package 创建型模式.建造者模式;

public class User {

    private String name;
    private String password;
    private int age;

    private User(String name, String password, int age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }

    public static class UserBuilder {
        private String name;
        private String password;
        private int age;

        private UserBuilder() {

        }

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder password(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            if (name == null || password == null) {
                throw new RuntimeException("用户名/密码必填");
            }

            if (age <= 0 || age >= 150) {
                throw new RuntimeException("年龄不合法");
            }

            return new User(name, password, age);
        }
    }
}
