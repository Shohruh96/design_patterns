package strategy.behaviors.quack;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("rezinoviy o'rdak");
    }
}
