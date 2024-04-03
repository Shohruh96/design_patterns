package factory.v4.store;

import factory.v4.pizza.nyPizza.NYStyleCheesePizza;
import factory.v4.pizza.Pizza;
import factory.v4.pizza.nyPizza.NYStylePepperoniPizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")){
            return new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        }
        return null;
    }
}
