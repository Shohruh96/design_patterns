package factory.v4.pizza.chicagoPizza;

import factory.v4.pizza.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza(){
        name = "Chikagocha pishloqli pizza";
        dough = "Qalin qobiqli xamir";
        sauce = "Olxo'ri pomidor souse";
        toppings.add("Maydalangan mazzarella pishloq");
    }

    public void cut(){
        System.out.println("Pizza kvadrat qilib kesildi.");
    }
}
