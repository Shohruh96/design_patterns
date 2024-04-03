package decarator.starbuzz_v2.ichimliklar;

import decarator.starbuzz_v2.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }    @Override
    public double cost() {
        return .89;
    }
}
