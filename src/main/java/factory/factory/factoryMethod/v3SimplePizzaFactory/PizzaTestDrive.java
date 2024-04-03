package factory.factory.factoryMethod.v3SimplePizzaFactory;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        pizzaStore.orderPizza("veggie");
        pizzaStore.orderPizza("pepperoni");
        pizzaStore.orderPizza("cheese");
    }
}
