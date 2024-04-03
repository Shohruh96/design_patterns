package strategy.ducks;

import strategy.behaviors.fly.FylNoWay;
import strategy.behaviors.quack.Quack;

public class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehavior = new FylNoWay();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I'm model duck");
    }
}
