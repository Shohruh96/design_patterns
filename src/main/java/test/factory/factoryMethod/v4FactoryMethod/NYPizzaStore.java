package test.factory.factoryMethod.v4FactoryMethod;

import test.factory.factoryMethod.v4FactoryMethod.pizzalar.NYStyleCheesePizza;
import test.factory.factoryMethod.v4FactoryMethod.pizzalar.NYStylePepperoniPizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        if (item.equals("pepperoni")){
            return new NYStylePepperoniPizza();
        } else if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        }
        return null;
    }
}
