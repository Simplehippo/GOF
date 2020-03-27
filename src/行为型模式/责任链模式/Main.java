package 行为型模式.责任链模式;

/**
 * 责任链模式：适用于流程式的操作，例如 Spring 的拦截器链
 */
public class Main {

    public static void main(String[] args) {
        RuleHandlerChain chain = new RuleHandlerChain();
        chain.addHandler(new NewUserRuleHandler());
        chain.addHandler(new LocationRuleHandler());

        Context context = new Context(true, "america");
        chain.apply(context);
    }
}
