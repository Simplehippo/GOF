package 行为型模式.责任链模式;

public class NewUserRuleHandler extends RuleHandler {
    @Override
    public void apply(Context context) {
        if (context.isNewUser()) {
            if (successor != null) {
                successor.apply(context);
            }
        } else {
            throw new RuntimeException("活动仅新用户能参与");
        }
    }
}
