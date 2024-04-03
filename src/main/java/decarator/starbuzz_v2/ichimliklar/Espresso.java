package decarator.starbuzz_v2.ichimliklar;

import decarator.starbuzz_v2.Beverage;

public class Espresso extends Beverage {
    public Espresso(){
        description = "Espresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
