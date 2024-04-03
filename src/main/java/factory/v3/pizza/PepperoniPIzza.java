package factory.v3.pizza;

public class PepperoniPIzza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Pepperoni Pizza Tayyorlanmoqda...");
    }

    @Override
    public void bake() {
        System.out.println("Pepperoni Pizza pichda");
    }

    @Override
    public void cut() {
        System.out.println("Pepperoni Pizza dioganal qilib kesilmoqda");
    }

    @Override
    public void box() {
        System.out.println("Pepperoni Pizza qadoqlanmoqda");
    }
}
