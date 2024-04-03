package factory.factory.factoryMethod.v3SimplePizzaFactory.foods;

import factory.factory.factoryMethod.v3SimplePizzaFactory.Pizza;

public class PepperoniPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Pepperoni Pizza tayyorlanmoqda...");
    }

    @Override
    public void bake() {
        System.out.println("Pepperoni Pizza pechda...");
    }

    @Override
    public void cut() {
        System.out.println("Pepperoni Pizza dioganal kesilmoqda...");
    }

    @Override
    public void box() {
        System.out.println("Pepperoni Pizza qadoqlanmoqda...");
    }
}
