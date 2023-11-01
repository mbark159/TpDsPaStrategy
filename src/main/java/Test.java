import context.Context;
import strategy.StrategyImpl1;
import strategy.StrategyImpl2;
import strategy.StrategyImpl3;

public class Test {
    public static void main(String[] args) {
        Context context=new Context();
        //context.setStrategy(new StrategyImpl3());
        context.applyStrategy();
    }
}
