package test.factory.factoryMethod.v2;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza("cheese");
        pizzaStore.orderPizza("pepperoni");
    }
}
