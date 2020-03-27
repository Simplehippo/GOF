package 行为型模式.责任链模式;

public class LocationRuleHandler extends RuleHandler {
    @Override
    public void apply(Context context) {
        String location = context.getLocation();
        if ("china".equals(location)) {
            if (successor != null) {
                successor.apply(context);
            }
        } else {
            throw new RuntimeException("活动仅中国用户参与");
        }
    }
}
