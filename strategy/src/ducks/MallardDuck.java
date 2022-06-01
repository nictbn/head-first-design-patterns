package ducks;

import ducks.behaviours.flying.FlyWithWings;
import ducks.behaviours.quacking.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real mallard duck");
    }
}
