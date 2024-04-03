package decarator.starbuzz_v2.ichimliklar;

import decarator.starbuzz_v2.Beverage;

public class DarkRoast extends Beverage {
    public String getDescription() {
        return "Dark Roast";
    }
    @Override
    public double cost() {
        return .99;
    }
}
