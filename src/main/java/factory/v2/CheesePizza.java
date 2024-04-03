package factory.v2;

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
        System.out.println("Cheese Pizza dioganal kesilmoqda");
    }
    @Override
    public void box() {
        System.out.println("Cheese Pizza qadoqlanmoqda");
    }
}
