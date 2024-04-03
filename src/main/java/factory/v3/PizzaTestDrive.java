package factory.v3;

import factory.v3.factory.SimplePizzaFactory;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        pizzaStore.orderPizza("veggie");
    }
}
