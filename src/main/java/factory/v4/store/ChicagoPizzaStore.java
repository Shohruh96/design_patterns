package factory.v4.store;

import factory.v4.pizza.Pizza;
import factory.v4.pizza.chicagoPizza.ChicagoStyleCheesePizza;
import factory.v4.pizza.chicagoPizza.ChicagoStylePepperoniPizza;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        }
        return null;
    }
}
