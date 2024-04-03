package decarator.starbuzz_v2;

import decarator.starbuzz_v2.bezovchilar.Mocha;
import decarator.starbuzz_v2.bezovchilar.Soy;
import decarator.starbuzz_v2.bezovchilar.Whip;
import decarator.starbuzz_v2.ichimliklar.DarkRoast;
import decarator.starbuzz_v2.ichimliklar.Espresso;
import decarator.starbuzz_v2.ichimliklar.HouseBlend;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
        + ": $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()
        + ": $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()
        + ": $" + beverage3.cost());
    }
}
