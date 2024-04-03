package factory.v4.store;

import factory.v4.pizza.Pizza;

import java.util.ArrayList;

public abstract class PizzaStore {

    public abstract Pizza createPizza(String item);

    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
