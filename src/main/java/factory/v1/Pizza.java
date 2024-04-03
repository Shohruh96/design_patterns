package factory.v1;

import java.util.ArrayList;

public class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<Pizza> toppings = new ArrayList<>();

    public Pizza(String name){
        this.name = name;
    }

    public void prepare(){
        System.out.println(name + " tayyorlanmoqda");
        System.out.println("Hamir silkitilmoqda...");
        System.out.println("Sous qo'shilmoqda...");
        System.out.println("Qo'shimchalar qo'shilmoqda: ");
        for (Pizza topping : toppings) {
            System.out.println("  " + topping);
        }
    }
    public void bake(){
        System.out.println("350 darajada 25 daqida pishiriladi.");
    }
    public void cut(){
        System.out.println("Pizza dioganal bo'laklarga kesiladi.");
    }
    public void box(){
        System.out.println("Pizza qadoqlandi.");
    }
}
class  PizzaStore{
    public Pizza orderPizza(){
        Pizza pizza = new Pizza("Pepperoni");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
class PizzaTestDrive{
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza();
    }
}
