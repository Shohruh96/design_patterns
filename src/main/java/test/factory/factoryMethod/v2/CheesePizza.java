package test.factory.factoryMethod.v2;

public class CheesePizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Cheese Pizza tayyorlanmoqda...");
    }
    @Override
    public void bake() {
        System.out.println("Cheese Pizza tandirda");
    }
    @Override
    public void cut() {
        System.out.println("Cheese Pizza to'rtburchak kesilmoqda");
    }
    @Override
    public void box() {
        System.out.println("Cheese Pizza qadoqlanmoqda");
    }
}
