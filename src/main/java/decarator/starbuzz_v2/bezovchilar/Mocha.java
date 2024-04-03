package decarator.starbuzz_v2.bezovchilar;

import decarator.starbuzz_v2.Beverage;
import decarator.starbuzz_v2.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+", Mocha";
    }
    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
