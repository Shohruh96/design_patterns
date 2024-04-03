package test.factory.factoryMethod.v4FactoryMethod.pizzalar;

import test.factory.factoryMethod.v4FactoryMethod.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        name = "Chikogacha Pepperoni Pizza";
        dough = "Qalin qobiqli xamir";
        sous = "Chili sous";
        toppings.add("Mozzarella pishloq");
    }
    @Override
    public void cut(){
        System.out.println("Pizza kvadrat kesildi.");
    }
}
