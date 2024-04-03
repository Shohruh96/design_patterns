package test.strategy;

import test.strategy.qobiliyatlar.Nayza;
import test.strategy.qobiliyatlar.Pichoq;

public class RingTestDrive {
    public static void main(String[] args) {
        Jangchi j1 = new Brusle();
        j1.display();
        j1.performQurol();
        j1.setQurollar(new Pichoq());
        j1.performQurol();
        j1.setQurollar(new Nayza());
        j1.performQurol();
    }
}
