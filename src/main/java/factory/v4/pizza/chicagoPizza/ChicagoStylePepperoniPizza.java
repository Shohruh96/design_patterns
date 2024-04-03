package factory.v4.pizza.chicagoPizza;

import factory.v4.pizza.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza(){
        name = "Chikagocha qalampirli pizza";
        dough = "Qalin qobiqli xamir";
        sauce = "Olxo'ri pomidor souse";
        toppings.add("Maydalangan mozzarella pishloq");
    }
    public void cut(){
        System.out.println("Pizza kvadrat qilib kesilgan");
    }
}
