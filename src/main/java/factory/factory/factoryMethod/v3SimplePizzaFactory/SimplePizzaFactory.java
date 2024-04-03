package factory.factory.factoryMethod.v3SimplePizzaFactory;

import factory.factory.factoryMethod.v3SimplePizzaFactory.foods.CheesePizza;
import factory.factory.factoryMethod.v3SimplePizzaFactory.foods.PepperoniPizza;
import factory.factory.factoryMethod.v3SimplePizzaFactory.foods.VeggiePizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza = null;
        if (type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        } else if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
