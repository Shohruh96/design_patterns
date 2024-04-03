package factory.v4.pizza;

import java.util.ArrayList;

public abstract class Pizza {
    public String name;
    public String dough;
    public String sauce;
    public ArrayList<String> toppings = new ArrayList<>();

    public void prepare(){
        System.out.println(name+" tayyorlanmoqda");
        System.out.println("Testa silkitilmoqda...");
        System.out.println("Qo'shimchalar qo'shishmoqda...");
        System.out.println("Sous qo'shilmoqda...");
        for (String s : toppings){
            System.out.println(" " + s);
        }
    }
    public void bake(){
        System.out.println("350 darajada 25 daqiqa pishildi.");
    }
    public void cut(){
        System.out.println("Pitsa dioganal bo'laklarga kesib tashlandi.");
    };
    public void box(){
        System.out.println("Pitsa rasmiy PizzaStore qutisiga joylandi.");
    };

    public String getName(){
        return name;
    }
}
