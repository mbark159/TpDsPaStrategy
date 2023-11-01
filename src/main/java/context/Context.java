package context;

import strategy.DefaultStrategy;
import strategy.Strategy;

public class Context {
    private Strategy strategy=new DefaultStrategy();

    public void applyStrategy(){
        System.out.println("********** Strategy Start **********");
        strategy.apply();
        System.out.println("************ Stratgy End ***********");
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
