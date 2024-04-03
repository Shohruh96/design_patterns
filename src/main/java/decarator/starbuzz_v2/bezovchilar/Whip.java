package decarator.starbuzz_v2.bezovchilar;

import decarator.starbuzz_v2.Beverage;
import decarator.starbuzz_v2.CondimentDecorator;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+", Whip";
    }
    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
