package 行为型模式.责任链模式;

public abstract class RuleHandler {
    protected RuleHandler successor;

    public void setSuccessor(RuleHandler successor) {
        this.successor = successor;
    }

    public RuleHandler getSuccessor() {
        return successor;
    }

    public abstract void apply(Context context);
}
