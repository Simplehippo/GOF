package 结构型模式.组合模式;

/**
 * 组合模式：用于表示有层级结构的数据，使对单个对象和组合对象的访问具有一致性。
 */
public class Main {

    public static void main(String[] args) {
        Employee supervisor = new Employee("主管");
        supervisor.add(new Employee("员工1"));
        supervisor.add(new Employee("员工2"));

        System.out.println(supervisor);
    }
}
