package 行为型模式.责任链模式;

public class RuleHandlerChain {

    private RuleHandler head;
    private RuleHandler tail;

    public RuleHandlerChain() {

    }

    public void addHandler(RuleHandler handler) {
        if (head == null) {
            head = tail = handler;
        } else {
            tail.setSuccessor(handler);
            tail = handler;
        }
    }

    public void apply(Context context) {
        RuleHandler cursor = head;
        while(cursor != null) {
            cursor.apply(context);
            cursor = cursor.getSuccessor();
        }
    }
}
