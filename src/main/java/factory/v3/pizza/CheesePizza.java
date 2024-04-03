package factory.v3.pizza;

public class CheesePizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Cheese Pizza Tayyorlanmoqda...");
    }

    @Override
    public void bake() {
        System.out.println("Cheese Pizza pichda");
    }

    @Override
    public void cut() {
        System.out.println("Cheese Pizza dioganal qilib kesilmoqda");
    }

    @Override
    public void box() {
        System.out.println("Cheese Pizza qadoqlanmoqda");
    }
}
