package factory.factory.factoryMethod.v3SimplePizzaFactory.foods;

import factory.factory.factoryMethod.v3SimplePizzaFactory.Pizza;

public class CheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Cheese Pizza tayyorlanmoqda...");
    }

    @Override
    public void bake() {
        System.out.println("Cheese Pizza pechda...");
    }

    @Override
    public void cut() {
        System.out.println("Cheese Pizza dioganal kesilmoqda...");
    }

    @Override
    public void box() {
        System.out.println("Cheese Pizza qadoqlanmoqda...");
    }
}
