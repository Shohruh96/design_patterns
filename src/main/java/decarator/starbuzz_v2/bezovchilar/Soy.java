package decarator.starbuzz_v2.bezovchilar;

import decarator.starbuzz_v2.Beverage;
import decarator.starbuzz_v2.CondimentDecorator;

public class Soy extends CondimentDecorator {
    Beverage beverage;
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+", Soya";
    }
    @Override
    public double cost() {
        return .15 + beverage.cost();
    }
}
