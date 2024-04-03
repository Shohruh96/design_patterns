package factory.factory.factoryMethod.v2;

public class PepperoniPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Pepperoni Pizza tayyorlanmoqda...");
    }
    @Override
    public void bake() {
        System.out.println("Pepperoni Pizza tandirda");
    }
    @Override
    public void cut() {
        System.out.println("Pepperoni Pizza dioganal kesilmoqda");
    }
    @Override
    public void box() {
        System.out.println("Pepperoni Pizza qadoqlanmoqda");
    }
}
