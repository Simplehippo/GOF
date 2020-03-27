package 行为型模式.观察者模式;

public class HexObserver extends Observer {

    public HexObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        String result = Integer.toHexString(subject.getState());
        System.out.println("转换成十六进制：" + result);
    }
}
