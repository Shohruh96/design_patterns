package factory.v3.factory;

import factory.v3.pizza.CheesePizza;
import factory.v3.pizza.PepperoniPIzza;
import factory.v3.pizza.Pizza;
import factory.v3.pizza.VeggiePizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if (type.equals("cheese")){
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPIzza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
