package factory.v4;

import factory.v4.pizza.Pizza;
import factory.v4.store.ChicagoPizzaStore;
import factory.v4.store.NYPizzaStore;
import factory.v4.store.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza veggie = nyStore.orderPizza("cheese");

        Pizza veggie2 = chicagoStore.orderPizza("cheese");
    }
}
