package test.factory.factoryMethod.v3SimplePizzaFactory.foods;

import test.factory.factoryMethod.v3SimplePizzaFactory.Pizza;

public class VeggiePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Veggie Pizza tayyorlanmoqda...");
    }

    @Override
    public void bake() {
        System.out.println("Veggie Pizza pechda...");
    }

    @Override
    public void cut() {
        System.out.println("Veggie Pizza dioganal kesilmoqda...");
    }

    @Override
    public void box() {
        System.out.println("Veggie Pizza qadoqlanmoqda...");
    }
}
