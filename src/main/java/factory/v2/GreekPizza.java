package factory.v2;

public class GreekPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Greek Pizza tayyorlanmoqda...");
    }
    @Override
    public void bake() {
        System.out.println("Greek Pizza tandirda");
    }
    @Override
    public void cut() {
        System.out.println("Greek Pizza dioganal kesilmoqda");
    }
    @Override
    public void box() {
        System.out.println("Greek Pizza qadoqlanmoqda");
    }
}
