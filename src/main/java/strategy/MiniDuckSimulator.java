package strategy;

import strategy.behaviors.fly.FlyRocketPowered;
import strategy.ducks.Duck;
import strategy.ducks.MallarDuck;
import strategy.ducks.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallarDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
