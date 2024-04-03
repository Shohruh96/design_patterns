package test.strategy;

import test.strategy.qobiliyatlar.Qurollar;

public abstract class Jangchi {
    private Qurollar qurollar;

    public void setQurollar(Qurollar qurol){
        this.qurollar = qurol;
    }
    public abstract void display();
    public void performQurol(){
        qurollar.attack();
    }
}
