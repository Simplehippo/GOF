package 行为型模式.观察者模式;

/**
 * 观察者模式：观察者订阅主题，主题变更时通知所有的观察者。
 */
public class Main {

    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer binaryObserver = new BinaryObserver(subject);
        Observer hexObserver = new HexObserver(subject);

        subject.setState(7);
    }
}
