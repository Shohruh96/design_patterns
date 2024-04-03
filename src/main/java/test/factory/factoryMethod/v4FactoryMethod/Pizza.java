package test.factory.factoryMethod.v4FactoryMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    public String name;
    public String dough;
    public String sous;
    public List<String> toppings = new ArrayList<>();

    public void prepare(){
        System.out.println(name + " tayyorlanmoqda");
        System.out.println("Hamir silkitilmoqda...");
        System.out.print("Qo'shimchalar qo'shilmoqda: ");
        for (String e : toppings){
            System.out.print(e + ", ");
        }
        System.out.println();
        System.out.println("Sous qo'shilmoqda...");
    }
    public void bake(){
        System.out.println("350 darajada 25 daqiqa pishirildi.");
    }
    public void cut(){
        System.out.println("Pitsa dioganal kesilmoqdi.");
    }
    public void box(){
        System.out.println("Pitsa qadoqlandi.");
    }
}
