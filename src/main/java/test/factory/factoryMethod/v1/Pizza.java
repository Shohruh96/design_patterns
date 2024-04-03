package test.factory.factoryMethod.v1;

import java.util.ArrayList;

public class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();
    public Pizza(String name){
        this.name = name;
    }

    public void prepare(){
        System.out.println(name + " tayyorlanmoqda");
        System.out.println("Hamir silkitilmoqda...");
        System.out.println("Sous qo'shilmoqda...");
        System.out.println("Qo'shimchalar qo'shilmoqda: ");
        for (String topping : toppings){
            System.out.println(" " + topping);
        }
    }
    public void bake(){
        System.out.println("350 darajada 25 daqiqa pishiriladi.");
    }
    public void cut(){
        System.out.println("Pizza dioganal bo'laklarga kesildi.");
    }
    public void box(){
        System.out.println("Pizza qadoqlandi.");
    }
}
