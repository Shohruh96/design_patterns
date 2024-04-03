package factory.v2;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza("pepperoni");
        pizzaStore.orderPizza("greek");
    }
}
