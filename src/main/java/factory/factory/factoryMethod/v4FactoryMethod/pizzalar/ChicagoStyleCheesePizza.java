package factory.factory.factoryMethod.v4FactoryMethod.pizzalar;

import factory.factory.factoryMethod.v4FactoryMethod.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chikogacha Cheese Pizza";
        dough = "Qalin qobiqli xamir";
        sous = "Chili sous";
        toppings.add("Mozzarella pishloq");
    }
    @Override
    public void cut(){
        System.out.println("Pizza kvadrat kesildi.");
    }
}
