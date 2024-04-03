package test.factory.factoryMethod.v4FactoryMethod;

import test.factory.factoryMethod.v4FactoryMethod.pizzalar.ChicagoStyleCheesePizza;
import test.factory.factoryMethod.v4FactoryMethod.pizzalar.ChicagoStylePepperoniPizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        if (item.equals("pepperoni")){
            pizza = new ChicagoStylePepperoniPizza();
        } else if (item.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        }
        return pizza;
    }
}
