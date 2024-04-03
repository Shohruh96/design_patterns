package test.factory.factoryMethod.v1;

public class PizzaStore {

    public Pizza orderPizza(){
        Pizza pizza = new Pizza("Pepperoni");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
