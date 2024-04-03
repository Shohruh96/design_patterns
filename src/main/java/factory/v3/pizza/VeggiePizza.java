package factory.v3.pizza;

public class VeggiePizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Veggie Pizza Tayyorlanmoqda...");
    }

    @Override
    public void bake() {
        System.out.println("Veggie Pizza pichda");
    }

    @Override
    public void cut() {
        System.out.println("Veggie Pizza dioganal qilib kesilmoqda");
    }

    @Override
    public void box() {
        System.out.println("Veggie Pizza qadoqlanmoqda");
    }
}
