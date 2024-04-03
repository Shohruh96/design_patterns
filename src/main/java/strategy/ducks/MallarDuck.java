package strategy.ducks;

import strategy.behaviors.fly.FlyWithWings;
import strategy.behaviors.quack.Quack;

public class MallarDuck extends Duck {

    public MallarDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("I'm a real Mallard duck");
    }
}
